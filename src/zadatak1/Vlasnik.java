package zadatak1;

public class Vlasnik {

    private String imePrezime;
    private String jmbg;
    private String brojLicneKarte;

    public Vlasnik(String imePrezime, String jmbg, String brojLicneKarte) {
        try {
            this.imePrezime = imePrezime;
            this.jmbg = jmbg;
            this.brojLicneKarte = brojLicneKarte;
        } catch (Exception e){
            System.out.println("Niste uneli pravilno podatke o vlasniku");
        }
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    @Override
    public String toString() {
        return "Ime i prezime vlasnika: " + imePrezime + ". JMBG: " + jmbg + ". Broj licne karte: " + brojLicneKarte;
    }
}
