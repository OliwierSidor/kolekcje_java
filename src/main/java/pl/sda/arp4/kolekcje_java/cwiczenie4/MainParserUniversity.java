package pl.sda.arp4.kolekcje_java.cwiczenie4;

import java.util.Optional;
import java.util.Scanner;

public class MainParserUniversity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University();
        String komenda;

        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            if (komenda.equalsIgnoreCase("dodaj")) {
                System.out.println("Podaj numer indeksu: ");
                long numerIndeksu = scanner.nextLong();

                if (university.czyZawieraStudenta(numerIndeksu)) {
                    System.err.println("Taki student już istnieje");
                    continue;
                }

                System.out.println("Podaj imie:");
                String imie = scanner.next();
                System.out.println("Podaj nazwisko:");
                String nazwisko = scanner.next();

                university.dodaj(numerIndeksu, imie, nazwisko);
            } else if (komenda.equalsIgnoreCase("wypisz")) {
                university.wypiszWszystkichStudentow();
            } else if (komenda.equalsIgnoreCase("zawiera")) {
                System.out.println("Podaj numer indeksu szukanego:");
                long numerIndeksu = scanner.nextLong();

                if (university.czyZawieraStudenta(numerIndeksu)){
                    System.out.println("Taki student isnieje");
                } else {
                    System.err.println("Nie ma takiego studenta");
                }
            } else if (komenda.equalsIgnoreCase("znajdz")) {
                System.out.println("Podaj numer szukanego indeksu");
                long numerIndeksu = scanner.nextLong();

                Optional<Student> szukanyStudent = university.zwrocStudetaOptional(numerIndeksu);
                if(szukanyStudent.isPresent()){
                    Student student = szukanyStudent.get();
                    System.out.println("Dane Studenta: " + student);
                } else {
                    System.err.println("Nie ma takiego studenta");
                }
            } else if (!komenda.equalsIgnoreCase("koniec")) {
                System.out.println("co Ty wpisałeś idioto");
            }
        } while (!komenda.equalsIgnoreCase("koniec"));
    }
}
