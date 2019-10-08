package zadatak1;

public class Stan extends Nekretnina {

    private double povrsinaPodruma;
    private double povrsinaTerase;

    public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma, double povrsinaTerase) {
        super(adresa, zona, kvadratura, vlasnik);
        if (povrsinaPodruma >= 0) {
            this.povrsinaPodruma = povrsinaPodruma;
            this.povrsinaTerase = povrsinaTerase;
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
        return kvadratura * cenaKvadrataUZavisnostiOdZone(zona) + ((povrsinaPodruma + povrsinaTerase) * cenaKvadrataUZavisnostiOdZone(zona) * 0.33);
    }

    @Override
    public String toString() {
        return "Adresa stana je: " + adresa + ". Zona je: " + zona + ". Kvadratura stana je: " + kvadratura
                + ". Cena stana je: " + izracunajCenu() + " Eura. " + vlasnik;
    }
}
