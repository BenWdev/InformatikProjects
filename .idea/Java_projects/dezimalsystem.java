public class dezimalsystem {
    public static void main(String[] args) {

        int zahl = 0;


        while (zahl < 1 || zahl > 10) {
            System.out.print("Zahl zwischen 1 und 10 eingeben: ");
            String eingabe = System.console().readLine();

            //überprüfung ob zahl zwischen 1 und 10


            try {
                zahl = Integer.parseInt(eingabe);

                //wird in ganzahl umgewandelt

                if (zahl < 1 || zahl > 10) {
                    System.out.println("Zahl ungültig! Die Zahl muss zwischen 1 und 10 sein");

                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige eingabe");

                //wenn falsche eingabe dann error catchen und von vorne
            }
            }
        }

}

