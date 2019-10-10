package zadatak1;

public abstract class Nekretnina {

    protected String adresa;
    protected int zona;
    protected double kvadratura;
    protected Vlasnik vlasnik;
    static final String REGEX_ADRESA = "^[a-zA-Z0-9'\\.\\ŽžČčĆćŠšĐđ\\/\\-\\s]+$";


    public Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {

            if (kvadratura > 0) {
                this.kvadratura = kvadratura;
            } else {
                throw new IllegalArgumentException("Kvadratura mora biti veca od 0!");
            }

            if (adresa != null && !adresa.isEmpty() &&   adresa.matches(REGEX_ADRESA)) {
                this.adresa = adresa;
            } else {
                throw new IllegalArgumentException("Adresa nije unesena u validnom formatu!");
            }

            if (zona == 1 || zona == 2 || zona == 3 || zona == 4) {
                this.zona = zona;
            } else {
                throw new IllegalArgumentException("Moguce zone su 1, 2, 3 ili 4.");
            }

            if (vlasnik != null) {
                this.vlasnik = vlasnik;
            }


    }


    public abstract double izracunajCenu();

    public int cenaKvadrataUZavisnostiOdZone(int zona){
        int cenaKvadrata = 0;
        switch (zona){
            case 1: cenaKvadrata = 3000;
                break;
            case 2: cenaKvadrata = 2000;
                break;
            case 3: cenaKvadrata = 1000;
                break;
            case 4: cenaKvadrata = 500;
                break;
            default:
        }
        return cenaKvadrata;
    }




}
