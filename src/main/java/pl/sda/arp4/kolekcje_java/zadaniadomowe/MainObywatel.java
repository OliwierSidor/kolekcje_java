package pl.sda.arp4.kolekcje_java.zadaniadomowe;

import java.util.HashSet;
import java.util.Set;

public class MainObywatel {
    public static void main(String[] args) {
        Set<Obywatel> obywatelSet = new HashSet<>();
        obywatelSet.add(new Obywatel("Jan","Kowalski", "1231234"));
        obywatelSet.add(new Obywatel("Marian", "Nowak", "3213214"));
        obywatelSet.add(new Obywatel("Olek", "Bolek", "3331115"));
        obywatelSet.add(new Obywatel("Marian", "Roztocki", "1231234"));

        System.out.println("Ilosc: " + obywatelSet.size());
        System.out.println(obywatelSet);
    }
}

