package pl.sda.arp4.kolekcje_java.cwiczenie3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");

        String tekst = scanner.nextLine();
        String tekstBezPrzecinkow = tekst.replaceAll(",", "");
        String tekstBezKropekIPrzecinkow = tekstBezPrzecinkow.replaceAll("[.]", "");
        String[] slowa = tekstBezKropekIPrzecinkow.split(" ");
        Set<String> zbiorWliscie = new HashSet<>(Arrays.asList(slowa));

        System.out.println(zbiorWliscie);
    }
}

