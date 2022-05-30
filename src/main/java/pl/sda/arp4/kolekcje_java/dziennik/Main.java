package pl.sda.arp4.kolekcje_java.dziennik;

//Zadanie Dziennik Elektroniczny
//        Stwórz aplikację, a w niej klasę Dziennik i student. Stwórz również klasę Student. Klasa
//        Student powinna:
//        - posiadać listę ocen studenta (List<Double>)
//        - posiadać (pole) numer indeksu studenta (String)
//        - posiadać (pole) imię studenta
//        - posiadać (pole) nazwisko studenta


import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta("123", "Oliwier", "Sidor");
        dziennik.wypiszListeStudentow();
        dziennik.usunStudenta("1223");
        dziennik.usunStudenta("1234");

        Optional<Student> optionalStudent = dziennik.zwrocStudenta("123");
        if(optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            System.out.println("Imie i Nazwisko: " + student.getImie() + " " + student.getNazwisko());
        } else {
            System.out.println("Nie ma takiego studenta");
        }
        Optional<Double> optionalSrednia = dziennik.podajSredniaStudenta("123");
        if(optionalSrednia.isPresent()){
            double sredniaStudenta = optionalSrednia.get();
            System.out.println("Średnia studenta " + sredniaStudenta);
        }else{
            System.out.println("Nie mozna policzyć sredniej");
        }
        dziennik.dodajOcene("123", 6.0);
        dziennik.dodajOcene("123", 3.0);
        dziennik.dodajOcene("123", 2.0);
        dziennik.dodajOcene("123", 4.0);
        dziennik.dodajOcene("123", 6.0);

        Optional<Double> optionalSredniaStudenta = dziennik.podajSredniaStudenta("123");
        if(optionalSredniaStudenta.isPresent()){
            double sredniaStudenta = optionalSredniaStudenta.get();
            System.out.println("Średnia studenta " + sredniaStudenta);
        }else{
            System.out.println("Nie mozna policzyć sredniej");
        }
        List<Student> listaStudentowZagrozonych = dziennik.podajStudentowZagrozonych();
        System.out.println("Lista zagrozonych: " + listaStudentowZagrozonych);
    }
}
