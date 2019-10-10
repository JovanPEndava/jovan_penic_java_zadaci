package zadatak1;

public class Kuca extends Nekretnina {

    private double povrsinaOkucnice;

    public Kuca(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaOkucnice) {
        super(adresa, zona, kvadratura, vlasnik);

            if (povrsinaOkucnice >= 0)  {
                this.povrsinaOkucnice = povrsinaOkucnice;
            } else {
                throw new IllegalArgumentException("Povrsina okucnice mora biti 0 ako ne postoji, ili veca od 0!");
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
        if (vlasnik != null) {
            return new StringBuilder("Adresa kuce je: " + adresa + ". Zona je: " + zona + ". Kvadratura kuce je: " + kvadratura +
                    " m2. Cena kuce je: " + izracunajCenu() + " Eura.     \n" + vlasnik).toString();
        } else {
            return new StringBuilder("Adresa kuce je: " + adresa + ". Zona je: " + zona + ". Kvadratura kuce je: " + kvadratura +
                    " m2. Cena kuce je: " + izracunajCenu() + " Eura.").toString();
        }

    }

}
