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
        StringBuilder sb = new StringBuilder();
        sb.append("Adresa kuce je: ");
        sb.append(adresa);
        sb.append(". Zona je: ");
        sb.append(zona);
        sb.append(". Kvadratura kuce je: ");
        sb.append(kvadratura);
        sb.append(" m2. Cena kuce je: ");
        sb.append(izracunajCenu());
        sb.append(" Eura.     \n");
        if (vlasnik != null) {
            sb.append(vlasnik);
        }
        return  sb.toString();
    }


}
