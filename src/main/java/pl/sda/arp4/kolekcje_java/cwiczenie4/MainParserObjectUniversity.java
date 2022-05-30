package pl.sda.arp4.kolekcje_java.cwiczenie4;

import java.util.Scanner;

public class MainParserObjectUniversity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University();

        UniversityParser universityParser = new UniversityParser(scanner, university);
        universityParser.obslugaKomend();
    }
}
