package zadatak1;

public class MainTest {

    public static void main(String[] args) {

        Vlasnik vlasnikStana = new Vlasnik("Pera Peric", "0520980123122", "007575755");
        Vlasnik vlasnikKuce = new Vlasnik("Zika Zikic", "1206974123123", "007575565");

        int choice = 0;

        do {
            System.out.println("Glavni meni zadatka. Izaberite jednu od ponudjenih opcija: ");
            System.out.println("1. Podaci o stanu");
            System.out.println("2. Podaci o kuci");
            System.out.println("3. Kraj programa");
            choice = StandardniUlaz.prihvatiBrojPrekoSUlaza();

            switch (choice) {
                case 1:
                    System.out.println("Izabrali ste stan");
                    System.out.println("Unesite adresu stana");
                    String adresaStana = StandardniUlaz.prihvatiStringPrekoSUlaza();
                    System.out.println("Unesite zonu u kojoj se nalazi stan");
                    int zonaStana = StandardniUlaz.prihvatiBrojPrekoSUlaza();
                    System.out.println("Unesite kvadraturu stana");
                    double kvadraturaStana = StandardniUlaz.prihvatiDecimalniBrojPrekoSUlaza();
                    System.out.println("Unesite povrsinu podruma");
                    double povrsinaPodruma = StandardniUlaz.prihvatiDecimalniBrojPrekoSUlaza();
                    System.out.println("Unesite povrsinu terase");
                    double povrsinaTerase = StandardniUlaz.prihvatiDecimalniBrojPrekoSUlaza();
                    Nekretnina stan = new Stan(adresaStana, zonaStana, kvadraturaStana, vlasnikStana, povrsinaPodruma, povrsinaTerase);
                    System.out.println(stan.toString());
                    break;

                case 2:
                    System.out.println("Izabrali ste kucu");
                    System.out.println("Unesite adresu kuce");
                    String adresaKuce = StandardniUlaz.prihvatiStringPrekoSUlaza();
                    System.out.println("Unesite zonu u kojoj se nalazi kuca");
                    int zonaKuce = StandardniUlaz.prihvatiBrojPrekoSUlaza();
                    System.out.println("Unesite kvadraturu kuce");
                    double kvadraturaKuce = StandardniUlaz.prihvatiDecimalniBrojPrekoSUlaza();
                    System.out.println("Unesite povrsinu okucnice");
                    double povrsinaOkucnice = StandardniUlaz.prihvatiDecimalniBrojPrekoSUlaza();
                    Nekretnina kuca = new Kuca(adresaKuce, zonaKuce, kvadraturaKuce, vlasnikKuce, povrsinaOkucnice);
                    System.out.println(kuca.toString());
                    break;
            }
        } while (choice != 3);




    }
}
