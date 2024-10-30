import java.util.Scanner;

public class kapital_Rechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie das Kapital an:");
        double kapital = scanner.nextDouble();

        System.out.println("Wie viele Jahre wird das Geld angelegt:");
        int jahre = scanner.nextInt();

        System.out.println("Wie lautet der prozentsatz mit dem sie ihr kapital verzinsen:");
        double prozentsatz = scanner.nextDouble();

        for (int i = 1; i <= jahre; i++) {
            kapital = kapital * (1 + prozentsatz / 100);

            System.out.println("Das Kapital nach Jahr " + i + ". Kapital ist: " + Math.floor(kapital));
        }

    }

}
