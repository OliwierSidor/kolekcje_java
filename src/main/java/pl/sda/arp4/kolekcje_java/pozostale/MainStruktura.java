package pl.sda.arp4.kolekcje_java.pozostale;

import pl.sda.arp4.kolekcje_java.pozostale.Panstwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainStruktura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Panstwo> mapa = new HashMap<>();

        Panstwo polskaPanstwo = new Panstwo("Polska", "Warszawa", 3);

        mapa.put("Polska", polskaPanstwo);
        mapa.put("Niemcy", new Panstwo("Niemcy", "Berlin", 5));
        mapa.put("Czechy", new Panstwo("Czechy", "Praga", 1));

        System.out.println("Podaj Państwo");
        String nazwaKraju = scanner.next();
        if (mapa.containsKey(nazwaKraju)){
            Panstwo obiektPanstwo = mapa.get(nazwaKraju);
            System.out.println(obiektPanstwo);
            System.out.println("Ilość obywateli: " + obiektPanstwo.getLiczbaLudnosci());
        } else {
            System.err.println("Nie ma takiego Państwa");
        }
    }
}
