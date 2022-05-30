package pl.sda.arp4.kolekcje_java.zadaniadomowe;

public class Produkt {
    private String nazwa;
    private double cena;
    private int ilosc;
    private String kodProduktu;

    public Produkt(String nazwa, double cena, int ilosc, String kodProduktu) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
        this.kodProduktu = kodProduktu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public String getKodProduktu() {
        return kodProduktu;
    }

    public void setKodProduktu(String kodProduktu) {
        this.kodProduktu = kodProduktu;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", ilosc=" + ilosc +
                ", kodProduktu='" + kodProduktu + '\'' +
                '}';
    }
}
