package pl.sda.arp4.kolekcje_java.zadaniadomowe;

//Stwórz MainProduktMapa
//        Stwórz klasę Produkt, pola:
//        nazwa
//        cena
//        stan magazynu (ilość) (int)
//        kod produktu (String)
//        W klasie MainProduktMapa stwórz mapę. Dodaj kilka produktów do mapy.
//        Stwórz 'parser'. Jako wejście dodaj obsługę komendy:
//        wypisz wszystkie produkty (wypisz)
//        znajdź produkty (liczba mnoga) po nazwie (znajdz)
//        użytkownik podaje nazwe szukanego produktu a my wypisujemy czy taki produkt istnieje, a jeśli istnieje to również jaki jest stan magazynowy tego produktu
//        dodaj produkt (dodaj)
//        użytkownik wpisuje wszystkie parametry dodawanego produktu
//        usuń produkt (usun)
//        użytkownik podaje nazwę produktu i my usuwamy

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainProdukt {
    public static void main(String[] args) {
        Map<String, Produkt> mapaProduktow = new HashMap<>();
        mapaProduktow.put("maslo", new Produkt("maslo", 2.30, 5, "123456"));
        mapaProduktow.put("chleb", new Produkt("chleb", 5.30, 10, "234567"));
        mapaProduktow.put("ser", new Produkt("ser", 10.30, 8, "345678"));

        Scanner scanner = new Scanner(System.in);
        String komenda;

        do{

////            if (komenda.equalsIgnoreCase("wypisz")){
//                System.out.println(mapaProduktow);
//            } else if (komenda.equalsIgnoreCase("znajdz")) {
//                String nazwa = scanner.next();

//            }
            System.out.println("Podaj komende: ");
            komenda = scanner.next();


            if (komenda.equalsIgnoreCase("dodaj")){

                System.out.println("podaj nazwę: ");
                String nazwa = scanner.next();

                if (mapaProduktow.containsKey(nazwa)){
                    continue;
                }

                System.out.println("Podaj cene: ");
                double cena = scanner.nextDouble();

                System.out.println("Podaj ilosc: ");
                int ilosc = scanner.nextInt();

                System.out.println("Podaj kod: ");
                String kod = scanner.next();

                Produkt p = new Produkt(nazwa, cena, ilosc, kod);
                mapaProduktow.put(nazwa, p);
            }
        }while (!komenda.equalsIgnoreCase("koniec"));
    }
}
