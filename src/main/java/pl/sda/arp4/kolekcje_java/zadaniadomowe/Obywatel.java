package pl.sda.arp4.kolekcje_java.zadaniadomowe;

import java.util.Objects;

public class Obywatel {
    private String imie;
    private String nazwisko;
    private String pesel;

    public Obywatel(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obywatel obywatel = (Obywatel) o;
        return Objects.equals(pesel, obywatel.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }
}
