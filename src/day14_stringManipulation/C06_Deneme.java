package day14_stringManipulation;

public class C06_Deneme {
    public static void main(String[] args) {
            // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
            //      isim-soyisim : M***** B*******
            //      kart no : **** **** **** 1234


        String ısım="Gulsum  zeynep";
        String soyısım="Aycicek";
        String kartNo="1234567890123467";

        String yenıİsım=ısım.substring(0,1).toUpperCase()+ısım.substring(1).replaceAll("\\S","*");

        String yenıSoyısım=soyısım.substring(0,1).toUpperCase()+soyısım.substring(1).replaceAll("\\S","*");

        String yenıKartno=kartNo.substring(12);

        System.out.println("isim-soyisim : "+yenıİsım+" "+yenıSoyısım+
                "\nkart no : " +yenıKartno);

    }


}
