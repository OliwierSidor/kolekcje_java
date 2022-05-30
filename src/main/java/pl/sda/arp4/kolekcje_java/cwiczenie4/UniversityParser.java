package pl.sda.arp4.kolekcje_java.cwiczenie4;

import java.util.Optional;
import java.util.Scanner;

public class UniversityParser {
    private Scanner scanner;
    private University university;

    public UniversityParser(Scanner scanner, University university) {
        this.scanner = scanner;
        this.university = university;
    }

    public void obslugaKomend(){
        String komenda;
        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();
            obslugaDodaj();

            if (komenda.equalsIgnoreCase("dodaj")) {

            } else if (komenda.equalsIgnoreCase("wypisz")) {
                obslugaWypisz();
            } else if (komenda.equalsIgnoreCase("zawiera")) {
                obslugaZawiera();
            } else if (komenda.equalsIgnoreCase("znajdz")) {
                obslugaZnajdz();
            } else if (!komenda.equalsIgnoreCase("koniec")) {
                obslugaKoniec();
            }
        } while (!komenda.equalsIgnoreCase("koniec"));
    }

    // handleAddCommand
    public void obslugaDodaj() {
        System.out.println("Podaj numer indeksu: ");
        long numerIndeksu = scanner.nextLong();

        if (university.czyZawieraStudenta(numerIndeksu)) {
            System.err.println("Taki student już istnieje");
            return;
        }

        System.out.println("Podaj imie:");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.next();

        university.dodaj(numerIndeksu, imie, nazwisko);
    }

    public void obslugaWypisz() {
        university.wypiszWszystkichStudentow();
    }

    public void obslugaZawiera() {
        System.out.println("Podaj numer indeksu szukanego:");
        long numerIndeksu = scanner.nextLong();
        boolean zawiera = university.czyZawieraStudenta(numerIndeksu);
        if (zawiera) {
            System.out.println("Zawiera");
        } else {
            System.out.println("Nie zawiera");
        }
    }

    public void obslugaZnajdz() {
        System.out.println("Podaj numer indeksu szukanego:");
        long numerIndeksu = scanner.nextLong();
        Optional<Student> szukanyStudent = university.zwrocStudetaOptional(numerIndeksu);
        if (szukanyStudent.isPresent()) {
            Student student = szukanyStudent.get();
            System.out.println("Dane Studenta: " + student);
        } else {
            System.err.println("Nie ma takiego studenta");
        }
    }

    public void obslugaKoniec() {
        System.out.println("co Ty wpisałeś idioto");
    }
}
