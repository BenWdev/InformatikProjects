import java.util.Scanner;

public class fakultät {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib eine natürliche Zahl ein: ");
        int n = sc.nextInt();

        System.out.println("Die ersten fünf vielfachen von " + n + " sind: ");
        int zahl = 1;
        while (zahl <= n) {
            System.out.println(n * zahl);
            zahl++;
        }

        int fakultät = 1;
        int a = 1;
        while (a <= n) {
            fakultät *= a;
            a++;
        }
        System.out.println("Die fakultät von " + n + " ist: " + fakultät);

    }
}
