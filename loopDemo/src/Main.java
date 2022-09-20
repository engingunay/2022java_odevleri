public class Main {
    public static void main(String[] args) {
        //for döngüsü
        for (int a = 1; a < 30; a += 4) {
            System.out.println(a);
        }
        System.out.println("For Döngüsü Bitti");
        //while döngüsü
        int a = 2;
        while (a < 30) {
            System.out.println(a);
            a += 5;
        }
        System.out.println("While Döngüsü Bitti");
        //do-while döngüsü
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
