package pl.sda.arp4.kolekcje_java.pozostale;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        //List<X>
        // Map<K, Value>
        // Set<SX>

        Set<String> zbior = new HashSet<>();
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Niemcy");
        zbior.add("Francja");
        zbior.add("Czechy");
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Hiszpania");
        zbior.add("Portugalia");
        zbior.add("Anglia");

        System.out.println(zbior);
        for (String s : zbior) {
            
        }

    }
}
