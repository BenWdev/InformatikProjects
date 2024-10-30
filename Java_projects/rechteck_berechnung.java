package rechteck_berechnung;

public class rechteck_berechnung {

    public static void main(String[] args) {



        double laenge = Double.parseDouble(System.console().readLine("Bitte Laenge des Rechtecks eingeben: "));
        double hoehe = Double.parseDouble(System.console().readLine("Bitte die Hoehe des Rechtecks eingeben: "));


        double umfang = 2 * (laenge + hoehe);
        double flaecheninhalt = laenge * hoehe;


        System.out.println("Der Umfang des Rechtecks beträgt: " + umfang);
        System.out.println("Der Flächeninhalt des Rechtecks beträgt: " + flaecheninhalt);
    }
}
