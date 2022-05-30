package pl.sda.arp4.kolekcje_java.cwiczenie4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class University {
    private Map<Long, Student> mapa = new HashMap<>();

    public void dodaj(long indeks, String imie, String nazwisko) {
        Student nowoStworzonyStudentDoDodania = new Student(indeks, imie, nazwisko);
        mapa.put(indeks, nowoStworzonyStudentDoDodania);
        System.out.println("Dodano studenta: " + imie + " " + nazwisko);
    }

    public boolean czyZawieraStudenta(long szukanyIndeks) {
        return mapa.containsKey(szukanyIndeks);
    }

    public Student zwrocStudeta(long indeks) {
        return mapa.get(indeks);
    }

    public Optional<Student> zwrocStudetaOptional(long indeks) {
        if (mapa.containsKey(indeks)) {
            return Optional.of(mapa.get(indeks));
        } else {
            return Optional.empty();
        }
    }
    public int podajIloscStudentow(){
        System.out.println();
        return mapa.size();
    }
    public void wypiszWszystkichStudentow(){
        System.out.println();
        System.out.println("Lista studentow");
        for (Student student : mapa.values()) {
            System.out.println(student);
        }
    }
    public void wypiszWszystkieNumeryIndeksow(){
        System.out.println();
        System.out.println("Lista indeksow:");
        for (Long numerIndeksu : mapa.keySet()) {
            System.out.println(numerIndeksu);
        }

    }

}
