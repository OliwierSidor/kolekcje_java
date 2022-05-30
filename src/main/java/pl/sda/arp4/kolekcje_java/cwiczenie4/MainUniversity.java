package pl.sda.arp4.kolekcje_java.cwiczenie4;

public class MainUniversity {
    public static void main(String[] args) {
        University university = new University();
        university.dodaj(100200l, "Adam", "Mickiewicz");
        university.dodaj(234567l, "Juliusz", "Słowacki");
        university.dodaj(345678l, "Bolesław", "Prus");
        university.dodaj(456789l, "Gall", "Anonim");

        boolean czyZawiera = university.czyZawieraStudenta(100200L);
        if (czyZawiera){
            System.out.println("Zawiera studeta");
        } else {
            System.err.println("Nie zawiera studenta");
        }

        System.out.println(university.zwrocStudetaOptional(100200));

        System.out.println(university.zwrocStudeta(100200));

        System.out.println("Ilosc studentow: " + university.podajIloscStudentow());

        university.wypiszWszystkichStudentow();

        university.wypiszWszystkieNumeryIndeksow();


    }
}
