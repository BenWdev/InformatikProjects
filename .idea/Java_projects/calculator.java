import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Java Taschenrechner 2.0!");
        System.out.println("Mit dem Programm können Additionen, Subtraktionen und Multiplikationen durchgeführt werden");
        System.out.println("Bitte 2 Zahlen eingeben");

        System.out.println("Erste Zahl:");
        double nummer1 = sc.nextDouble();
        System.out.println("Zweite Zahl:");
        double nummer2 = sc.nextDouble();

        System.out.println("Bitte + für Addition, - für subtraktion und * für multiplikation");

        char operation = sc.next().charAt(0);

        double ergebnis;



        switch (operation) {
            case '+':
                ergebnis = nummer1 + nummer2;
                System.out.println("Ergebnis der Addition: " + nummer1 + " + " + nummer2 + " = " + ergebnis);
                break;

            case '-':
                ergebnis = nummer1 - nummer2;
                System.out.println("Ergebnis der Subtraktion: " + nummer1 + " - " + nummer2 + " = " + ergebnis);
                break;

            case '*':
                ergebnis = nummer1 * nummer2;
                System.out.println("Ergebnis der Multiplikation: " + nummer1 + " * " + nummer2 + " = " + ergebnis);
                break;
        }

    }
}
