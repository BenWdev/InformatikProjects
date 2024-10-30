import java.util.Scanner;

public class digitalerRechner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo ich bin dein Digitaler Taschenrechner. Gib Zahlen ein und ich addiere sie bis du eine 0 eingibts, dann gebe ich dir dein Ergebnis");

        int summe = 0;

        while (true) {
            int nummer = scanner.nextInt();

            if (nummer == 0) {
                System.out.println("Du hast eine 0 eingegeben und erhälst nun dein Ergebnis");
                break;
            }
            summe += nummer;
        }

        System.out.print("Das Ergebnis der Rechnung ist: " + summe);

        scanner.close();
    }
}
