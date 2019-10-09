package zadatak1;

public class Vlasnik {

    private String imePrezime;
    private String jmbg;
    private String brojLicneKarte;

    public Vlasnik(String imePrezime, String jmbg, String brojLicneKarte) {

            if (!imePrezime.isEmpty() && ! imePrezime.matches("(.*)[!@#$%^&*(){};:',.<>?/`~\\d](.*)")) {
                this.imePrezime = imePrezime;
            } else {
                throw new IllegalArgumentException("Greska pri unosu imena i prezimena vlasnika.");
            }


            if (jmbg.length() == 13 && !(jmbg.matches("(.*)\\D(.*)"))) {
                this.jmbg = jmbg;
            } else {
                throw new IllegalArgumentException("Uneti JMBG mora imati 13 cifara.");
            }

            if (brojLicneKarte.length() == 9 && !(brojLicneKarte.matches("(.*)\\D(.*)"))) {
                this.brojLicneKarte = brojLicneKarte;
            } else {
                throw new IllegalArgumentException("Uneti broj licne karte mora imati 9 cifara.");
            }

    }


    @Override
    public String toString() {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ime i prezime vlasnika: ");
        sb1.append(imePrezime);
        sb1.append(". JMBG: ");
        sb1.append(jmbg);
        sb1.append(". Broj licne karte: ");
        sb1.append(brojLicneKarte);
        return  sb1.toString();
    }
}
