package zadatak1;

public class Stan extends Nekretnina {

    private double povrsinaPodruma;
    private double povrsinaTerase;

    public Stan(String adresa, int zona, double kvadratura, Vlasnik vlasnik, double povrsinaPodruma, double povrsinaTerase) {
        super(adresa, zona, kvadratura, vlasnik);

            if (povrsinaPodruma >= 0) {
                this.povrsinaPodruma = povrsinaPodruma;
            } else {
                throw new IllegalArgumentException("Povrsina podruma mora biti 0 ako ne postoji, ili veca od 0!");
            }
            if (povrsinaTerase >= 0) {
                this.povrsinaTerase = povrsinaTerase;
            } else {
                throw new IllegalArgumentException("Povrsina terase mora biti 0 ako ne postoji, ili veca od 0!");
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
        StringBuilder sb = new StringBuilder();
        sb.append("Adresa stana je: ");
        sb.append(adresa);
        sb.append(". Zona je: ");
        sb.append(zona);
        sb.append(". Kvadratura stana je: ");
        sb.append(kvadratura);
        sb.append(" m2. Cena stana je: ");
        sb.append(izracunajCenu());
        sb.append(" Eura.     \n");
        if (vlasnik != null) {
            sb.append(vlasnik);
        }
        return  sb.toString();
    }
}
