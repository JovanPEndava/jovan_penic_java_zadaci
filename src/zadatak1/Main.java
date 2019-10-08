// Author: Jovan Penic
/*
- Napraviti apstraktnu klasa Nekretnina koja od atributa ima adresu, zonu, kvadraturu i podatke o vlasniku/instancu klase Vlasnik.
        Vlasnik ima puno ime i prezime, JMBG i broj lične karte.
- Izvedene klase, Stan i Kuca imaju toString() metod gde se ispisuju sve informacije o nekretnini uključujući Vlasnika i cenu
- Cena se računa po principu kvadratura X zona (I zona 3000, II zona 2000, III zona 1000, IV zona 500 €)
- Kuća ima dodatno polje površinaOkućnice.
- U cenu kuće ulazi i cena okućnice koja se računa po principu (površinaOkućnice X zona X 15%)
- Stan ima dva dodatna polja , površinaPodruma i površinaTerase.
- U cenu Stana ulazi i cena podruma i terase ((povrsinaPodruma+povrsinaTerase) X Zona X 33%)
- Napraviti Main klasu i u njoj kreirati instance klase Nekretnina i napraviti objekte izvedenih klasa sa proizvoljnim argumentima.
        Ispisati String reprezentaciju objekata – toString()
 */

package zadatak1;

public class Main {

    public static void main(String[] args) {

        Vlasnik vlasnikStana = new Vlasnik("Pera Peric", "0520980123122", "007575755");
        Vlasnik vlasnikKuce = new Vlasnik("Zika Zikic", "1206974123123", "007575565");

        Nekretnina stan = new Stan("Kosovska br. 8", 1, 70.5, vlasnikStana, 10.1, 15.4);
        Nekretnina kuca = new Kuca("Zivojina Misica br. 17", 3,130.2, vlasnikKuce, 30);

        System.out.println(stan.toString());
        System.out.println("=============================================================================================");
        System.out.println(kuca.toString());


    }

}
