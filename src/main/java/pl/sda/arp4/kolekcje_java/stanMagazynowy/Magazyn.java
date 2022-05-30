package pl.sda.arp4.kolekcje_java.stanMagazynowy;

import java.util.*;

public class Magazyn {
    Scanner scanner = new Scanner(System.in);

    private final Map<String, StanMagazynowyProduktu> mapaProduktow = new HashMap<>();

    public void dodaj() {
        String nazwa;
        do {
            System.out.println("Podaj produkt który chcesz umieścić na liscie magazynu lub wpisz 'koniec' jeśli chcesz zakończyć dodawanie produktów:");
            nazwa = scanner.nextLine();
            if (!nazwa.equalsIgnoreCase("koniec")) {
                System.out.println("Podaj jednostkę tego produktu: (gram/ilosc/litr/sztuka)");
                try {
                    Jednostka jednostka = Jednostka.valueOf(scanner.nextLine().toUpperCase());
                    dodajProdukt(nazwa, jednostka);
                } catch (IllegalArgumentException iae) {
                    System.out.println("Nie ma takiej jednostki");
                }
            }
        } while (!nazwa.equalsIgnoreCase("koniec"));
    }

    public void obsluz() {
        String coRobimy;
        do {
            System.out.println("Podaj co chcesz zrobić: (wypisz/usun/zwroc/zwieksz/zmniejsz/stan)");
            coRobimy = scanner.next();
            if (coRobimy.equalsIgnoreCase("wypisz")) {
                wypiszWszytkieProdukty();
            } else if (coRobimy.equalsIgnoreCase("usun")) {
                usunProdukt();
            } else if (coRobimy.equalsIgnoreCase("zwroc")) {
                zwrocProdukt();
            } else if (coRobimy.equalsIgnoreCase("zwieksz")) {
                zwieksz();
            } else if (coRobimy.equalsIgnoreCase("zmniejsz")) {
                zmniejsz();
            } else if (coRobimy.equalsIgnoreCase("stan")) {
                stan();
            }
        } while (!coRobimy.equalsIgnoreCase("koniec"));
    }

    private void dodajProdukt(String nazwa, Jednostka jednostka) {
        if (mapaProduktow.containsKey(nazwa)) {
            System.out.println("Produkt już jest na liście");
        } else {
            mapaProduktow.put(nazwa, new StanMagazynowyProduktu(nazwa, jednostka));
        }
    }

    private void wypiszWszytkieProdukty() {
        System.out.println("Wszystkie produkty dostępne na magazynie:");
        for (StanMagazynowyProduktu produkty : mapaProduktow.values()) {
            System.out.println(produkty);
        }
    }

    private void usunProdukt(String nazwa) {
        if (mapaProduktow.containsKey(nazwa)) {
            mapaProduktow.remove(nazwa);
        } else {
            System.out.println("Nie ma takiego produktu");
        }
    }

    private void usunProdukt() {
        System.out.println("Podaj nazwe produktu: ");
        String nazwa = scanner.next();
        usunProdukt(nazwa);
        System.out.println("Usunieto produkt: " + nazwa);
    }

    private Optional<StanMagazynowyProduktu> zwrocProdukt(String nazwa) {
        if (mapaProduktow.containsKey(nazwa)) {
            return Optional.of(mapaProduktow.get(nazwa));
        }
        return Optional.empty();
    }

    private void zwrocProdukt() {
        System.out.println("Podaj nazwe produktu: ");
        String nazwa = scanner.next();
        Optional<StanMagazynowyProduktu> zwroconyProdukt = zwrocProdukt(nazwa);
        if (zwroconyProdukt.isPresent()) {
            System.out.println(zwroconyProdukt.get());
        } else {
            System.out.println("Nie znalazlem produktu");
        }
    }

    private void zwiekszStanMagazynowy(String nazwa, double ilosc) {
        if (!mapaProduktow.containsKey(nazwa)) {
            System.out.println("Nie ma takiego produktu");
        } else {
            StanMagazynowyProduktu stanMagazynowyProduktu = mapaProduktow.get(nazwa);
            stanMagazynowyProduktu.setIlosc(stanMagazynowyProduktu.getIlosc() + ilosc);
        }
    }

    private void zwieksz() {
        System.out.println("Podaj nazwe produktu któremu chcesz zwiększyć stan magazynowy");
        String nazwa = scanner.next();
        System.out.println("Podaj o ile chcesz zwiększyć stan magazynowy");
        int ilosc = scanner.nextInt();
        zwiekszStanMagazynowy(nazwa, ilosc);
    }

    private void zmniejszStanMagazynowy(String nazwa, int ilosc) {
        if (!mapaProduktow.containsKey(nazwa) || mapaProduktow.get(nazwa).getIlosc() - ilosc < 0) {
            System.out.println("Operacja nie możliwa");
        } else {
            StanMagazynowyProduktu stanMagazynowyProduktu = mapaProduktow.get(nazwa);
            stanMagazynowyProduktu.setIlosc(stanMagazynowyProduktu.getIlosc() - ilosc);
        }
    }

    private void zmniejsz() {
        System.out.println("Podaj nazwe produktu któremu chcesz zmniejszyc stan magazynowy");
        String nazwa = scanner.nextLine();
        System.out.println("Podaj o ile chcesz zmniejszyc stan magazynowy");
        int ilosc = scanner.nextInt();
        zmniejszStanMagazynowy(nazwa, ilosc);
    }

    private List<StanMagazynowyProduktu> listaProduktowKtorychIloscJestMniejzaNiz(int ilosc) {
        List<StanMagazynowyProduktu> listaProduktow = new ArrayList<>();
        for (StanMagazynowyProduktu produkt : mapaProduktow.values()) {
            if (produkt.getIlosc() < ilosc) {
                listaProduktow.add(produkt);
            }
        }
        return listaProduktow;
    }

    private void stan() {
        System.out.println("Podaj produkty których stan jest mniejszy niż: (wpisz stan)");
        int ilosc = scanner.nextInt();
        List<StanMagazynowyProduktu> listaProduktow = listaProduktowKtorychIloscJestMniejzaNiz(ilosc);
        System.out.println(listaProduktow);
    }
}