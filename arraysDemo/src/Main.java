public class Main {
    public static void main(String[] args){
        String ogrenci1="Engin";
        String ogrenci2="Ozan";
        String ogrenci3="Seray";
        String ogrenci4="Eren";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        System.out.println("----------------");
        String[] ogrenciler=new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Ozan";
        ogrenciler[2]="Seray";
        ogrenciler[3]="Eren";
        for (int i=0; i< ogrenciler.length;i++ ){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------");
        for (String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }

    }
}