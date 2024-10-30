import java.util.Scanner;

public class summenRechner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte Zahl eingeben: ");
        int n = sc.nextInt();

        int summe = 0;
        int a = 1;

        while (a <= n) {
            summe += a;
            a++;

        }
        System.out.println("Die Summe der natürlichen Zahlen bis " + n + " ist " + summe);

    }
}
