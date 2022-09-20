public class Main {
    public static void main(String[] args) {
        char harf = 'p';
        switch (harf) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harf");
                break;
            case 'e':
            case 'i':
            case 'ü':
            case 'ö':
                System.out.println(("İnce sesli Harf"));
                break;
            default:
                System.out.println(("Yalnış değer girdiniz"));


        }


    }


}



