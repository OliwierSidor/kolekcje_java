package pl.sda.arp4.kolekcje_java.cwiczenie1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {

        Set<Integer> liczby = new TreeSet<>(Arrays.asList(10, 12, 10, 3, 4, 12, 12, 300, 12, 40, 55));
        System.out.println("Rozmiar: " + liczby.size());
        for (Integer element : liczby) {
            System.out.println("Element: " + element);
        }
        liczby.remove(10);
        liczby.remove(12);

        System.out.println();

        System.out.println("Rozmiar: " + liczby.size());
        for (Integer element : liczby) {
            System.out.println("Element: " + element);
        }
    }
}
