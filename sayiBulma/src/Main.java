public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {2,4,7,8,9,0};
        int aranacak = 22;
        boolean varMi=false;

        for (int sayi : sayilar){
            if (sayi==aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı Mevcuttur.");
        }else{
            System.out.println("Sayı mevcut değildir.");
        }

    }
}