public class variblen_tauschen {

    public static void main(String[] args) {

        int box1 = 2;
        int box2 = 3;

        int backup = box1;

        box1 = box2;

        box2 = backup;

        System.out.println("a:" + box1);
        System.out.println("b:" + box2);

    }

}
