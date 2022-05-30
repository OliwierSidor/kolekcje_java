package pl.sda.arp4.kolekcje_java.cwiczenie4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Long, Student> mapa = new HashMap<>();
        Student s1 = new Student(100200l, "Adam", "Mickiewicz");
        Student s2 = new Student(234567l, "Juliusz", "Słowacki");
        Student s3 = new Student(345678l, "Bolesław", "Prus");
        Student s4 = new Student(456789l, "Gall", "Anonim");

        mapa.put(s1.getNrIndeksu(), s1);
        mapa.put(s2.getNrIndeksu(), s2);
        mapa.put(s3.getNrIndeksu(), s3);
        mapa.put(s4.getNrIndeksu(), s4);

        boolean czyjestStudent = mapa.containsKey(100200l);
        int liczbaStudentow = mapa.size();
        String wszyscyStudenci = mapa.toString();

        System.out.println(czyjestStudent);
        System.out.println(liczbaStudentow);
        System.out.println(wszyscyStudenci);

        for (Long indeks : mapa.keySet()) {
            System.out.println(indeks + " ");
        }
        System.out.println();
        for (Student student : mapa.values()) {
            System.out.println(student + " ");
        }
        System.out.println();

        for (Map.Entry<Long, Student> wpis : mapa.entrySet()) {
            System.out.println(wpis.getKey() + " -> " + wpis.getValue());
        }
    }
}
