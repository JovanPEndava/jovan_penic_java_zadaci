package zadatak1;

public class Kuca extends Nekretnina {

    private double povrsinaOkucnice;

    public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
        super(adresa, zona, kvadratura, vlasnik);
        if (povrsinaOkucnice >= 0) {
            this.povrsinaOkucnice = povrsinaOkucnice;
        } else {
            System.out.println("Greska, niste pravilno uneli podatke.");
        }
    }

    @Override
    public int cenaKvadrataUZavisnostiOdZone(int zona) {
        return super.cenaKvadrataUZavisnostiOdZone(zona);
    }

    @Override
    public double izracunajCenu() {
        return kvadratura * cenaKvadrataUZavisnostiOdZone(zona) + povrsinaOkucnice * cenaKvadrataUZavisnostiOdZone(zona) * 0.15;
    }

    @Override
    public String toString() {
        return "Adresa kuce je: " + adresa + ". Zona je: " + zona + ". Kvadratura kuce je: " + kvadratura
                + ". Cena kuce je: " + izracunajCenu()+ " Eura. "+ vlasnik;
    }
    /* Metoda toString je mogla da se napise i u klasi Nekretnina, pa da se na opet Override-uje u izvedenim klasama, ali sam zeleo
       da umesto generickih izraza  (Adresa objekta:...   Kvadratura objekta:...), bas pise Adresa kuce:... i Adresa stana:...
     */

}
