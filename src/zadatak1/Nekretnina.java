// Author: Jovan Penic

package zadatak1;

public abstract class Nekretnina {

    protected String adresa;
    protected int zona;
    protected double kvadratura;
    protected Vlasnik vlasnik;
    //Ovde sam stavio protected atribute, jer sam zeleo da se vide u celom paketu, a to je potrebno zato sto sam ih stavio da budu ulazni parametri metoda, koje koristim u izvedenim klasama (npr u metodi izracunajCenu)

    public Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
        if (kvadratura > 0 && zona >= 1 && zona <= 4) {
            this.adresa = adresa;
            this.zona = zona;
            this.kvadratura = kvadratura;
            this.vlasnik = vlasnik;
        } else {
            System.out.println("Greska, niste pravilno uneli podatke.");
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
                System.out.println("Postoje samo zone 1, 2, 3 i 4");
        }
        return cenaKvadrata;
    }


}
