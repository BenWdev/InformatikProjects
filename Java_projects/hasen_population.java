public class hasen_population {
    public static void main(String[] args) {

        int wochen = 20;
        int paar1 = 1, paar2 = 1;


        System.out.println("Anzahl der Hasenpaare für ersten 20 Wochen:");
        System.out.println("Woche 1" + paar1);
        System.out.println("Paare 2" + paar2);

        for (int i = 3; i < wochen; i++) {

            int aktuell = paar1 + paar2;
            System.out.println("Anzahl der Hasenpaare: " + aktuell);
            paar1 = paar2;
            paar2 = aktuell;
        }

        paar1 = 1;
        paar2 = 1;

        int millionen = 2;
        while (paar2 < 1000000) {
            int aktuell = paar1 + paar2;
            paar1 = paar2;
            paar2 = aktuell;
            millionen++;
        }

        System.out.println("Die Anzahl der Population übersteigt 1 Million in Woche:" + millionen);

    }
}
