package pl.sda.arp4.kolekcje_java.dziennik;

//        Student powinna:
//        - posiadać listę ocen studenta (List<Double>)
//        - posiadać (pole) numer indeksu studenta (String)
//        - posiadać (pole) imię studenta
//        - posiadać (pole) nazwisko studenta

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class Student {
    private List<Double> listaOcen = new ArrayList<>();
    private String indeks;
    private String imie;
    private String nazwisko;

    public Student(String indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

}
