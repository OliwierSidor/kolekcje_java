package pl.sda.arp4.kolekcje_java.cwiczenie2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<ParaLiczb> zbiorParLiczb = new HashSet<>();
        ParaLiczb paraLiczb1 = new ParaLiczb(1,2);
        ParaLiczb paraLiczb2 = new ParaLiczb(2,1);
        ParaLiczb paraLiczb3 = new ParaLiczb(1,1);
        ParaLiczb paraLiczb4 = new ParaLiczb(1,2);

        zbiorParLiczb.add(paraLiczb1);
        zbiorParLiczb.add(paraLiczb2);
        zbiorParLiczb.add(paraLiczb3);
        zbiorParLiczb.add(paraLiczb4);

        System.out.println(zbiorParLiczb);
    }
}
