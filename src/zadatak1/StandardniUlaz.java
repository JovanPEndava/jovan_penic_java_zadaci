package zadatak1;

import java.util.Scanner;

public class StandardniUlaz {

    static int prihvatiBrojPrekoSUlaza() {
        Scanner stUlaz = new Scanner(System.in);
        try {
            return Integer.parseInt(stUlaz.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Greska, niste uneli broj kao format.");
            return 0;
        }
    }

    static String prihvatiStringPrekoSUlaza() {
        Scanner stUlaz = new Scanner(System.in);
        return stUlaz.nextLine();
    }

    static double prihvatiDecimalniBrojPrekoSUlaza() {
        Scanner stUlaz = new Scanner(System.in);
        try {
            return Double.parseDouble(stUlaz.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Greska, niste uneli broj kao format.");
            return 0;
            }
    }

}

