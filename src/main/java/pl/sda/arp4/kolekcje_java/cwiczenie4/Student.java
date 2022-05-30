package pl.sda.arp4.kolekcje_java.cwiczenie4;

import java.util.Objects;

public class Student {
    private long nrIndeksu;
    private String imie;
    private String nazwisko;

    public Student(long nrIndeksu, String imie, String nazwisko) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public long getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(long nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return nrIndeksu == student.nrIndeksu && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrIndeksu, imie, nazwisko);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrIndeksu=" + nrIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

}
