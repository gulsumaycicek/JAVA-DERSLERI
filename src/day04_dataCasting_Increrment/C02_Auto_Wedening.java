package day04_dataCasting_Increrment;

public class C02_Auto_Wedening {
    public static void main(String[] args) {

        byte sayı1=44;
        System.out.println(sayı1);


        short sayı2=sayı1;
        System.out.println(sayı2);

        double sayı3=sayı2;
        System.out.println(sayı3);



        boolean dogruMu=true;
        //String str=dogruMu; // sol String sag boolean olunca kabul etmiyor
        byte sayi1 = 44 ;
        System.out.println(sayi1); // 44
        short sayi2 = sayi1; // esitligin solu short, sagi ise byte olmasina ragmen java itiraz etmiyor
        // deger olarak atanan data turu variable data turunden kucuk oldugu icin java sorun yapmaz
        // Auto Widening
        System.out.println(sayi2); // 44
        double sayi3 =sayi2;
        System.out.println(sayi3); // 44.0
    }
}
