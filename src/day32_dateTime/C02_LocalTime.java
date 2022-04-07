package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);//22:09:51.579534900 şu ankı saat

        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz
        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }
        LocalTime tmLoopSonrası=LocalTime.now();
        System.out.println(tm);//22:14:30.998908800

        double nano1=tm.getNano();
        double nano2=tmLoopSonrası.getNano();

        System.out.println("işlem"+(nano2-nano1)+ "nano sanıyede bıttı");//işlem2998800.0nano sanıyede bıttı

        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));//15:00:07.667534200
        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz


    }
}
