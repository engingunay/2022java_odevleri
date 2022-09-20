public class Main {
    public static void main(String[] args) {
        String mesaj = "Şampiyon Fenerbahçe";
        System.out.println(mesaj);

       /* System.out.println("Eleman Sayısı : "+mesaj.length());
        System.out.println("5. eleman: "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("Ş"));
        System.out.println(mesaj.endsWith("e"));
        char[] karakterler =new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("on"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,7));
        for (String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
    }
}