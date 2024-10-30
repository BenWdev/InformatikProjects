package rechteck_berechnung;

import java.util.Scanner;

public class rechteck_berechnung_scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Bitte die Länge des Rechtecks eingeben: ");
        double laenge = scanner.nextDouble();

        System.out.print("Bitte die Höhe des Rechtecks eingeben: ");
        double hoehe = scanner.nextDouble();


        double umfang = 2 * (laenge + hoehe);
        double flaecheninhalt = laenge * hoehe;


        System.out.println("Der Umfang des Rechtecks beträgt: " + umfang);
        System.out.println("Der Flächeninhalt des Rechtecks beträgt: " + flaecheninhalt);

        scanner.close();
    }
}
