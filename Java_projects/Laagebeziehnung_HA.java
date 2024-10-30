import java.util.Scanner;

public class Laagebeziehnung_HA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mit diesem programm können sie die Parameter einer linearen Funktion berechnen");
        System.out.println("Steigung 1 Gerade:");
        double m1 = sc.nextDouble();
        System.out.println("y-Achsenabschnitt 1 Gerade:");
        double b1 = sc.nextDouble();

        System.out.println("Bitte Steigung und y-Achsenabschnitt angeben");
        System.out.println("Steigung 2 Gerade:");
        double m2 = sc.nextDouble();
        System.out.println("y-Achsenabschnitt 2 Gerade:");
        double b2 = sc.nextDouble();

        if (m1 == m2 && b1 == b2) {
            System.out.println("Die geraden sind identisch");
        }else if (m1 == m2) {
            System.out.println("Die Geraden sind parallel");
        }else {
            double x = (b2 - b1);
            double y = (m1 * x + b1);
            System.out.println("Die Geraden schneiden sich an" + "=" + x +"," +y);
        }


    }
}
