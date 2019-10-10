package zadatak1;

public class Vlasnik {

    private String imePrezime;
    private String jmbg;
    private String brojLicneKarte;
    static final String REGEX_IMENA = "^[a-zA-Z'\\ŽžČčĆćŠšĐđ\\-\\s]+$";
    static final String REGEX_JMBG_BR_LICNE_KARTE = "[0-9]+";

    public Vlasnik(String imePrezime, String jmbg, String brojLicneKarte) {

            if (!imePrezime.isEmpty() &&  imePrezime.matches(REGEX_IMENA)) {
                this.imePrezime = imePrezime;
            } else {
                throw new IllegalArgumentException("Greska pri unosu imena i prezimena vlasnika.");
            }


            if (jmbg.length() == 13 && jmbg.matches(REGEX_JMBG_BR_LICNE_KARTE)) {
                this.jmbg = jmbg;
            } else {
                throw new IllegalArgumentException("Uneti JMBG mora imati 13 cifara.");
            }

            if (brojLicneKarte.length() == 9 && brojLicneKarte.matches(REGEX_JMBG_BR_LICNE_KARTE)) {
                this.brojLicneKarte = brojLicneKarte;
            } else {
                throw new IllegalArgumentException("Uneti broj licne karte mora imati 9 cifara.");
            }

    }

    @Override
    public String toString() {
        return new StringBuilder("Ime i prezime vlasnika: " + imePrezime +". JMBG: " + jmbg + ". Broj licne karte: " + brojLicneKarte).toString();
    }


}
