public class Main {
    public static void main(String[] args) {
        int number=8128;
        int total=0;
        for (int i=1;i<8127;i++){
            if (number % i==0){
                total = total+i;
            }
        }
        if (total==number){
            System.out.println("Mükemmel Sayıdır");
        }else{
            System.out.println("Mükemmel Sayı değildir");
        }
    }
}