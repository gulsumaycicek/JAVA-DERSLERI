package day38_inheritance_overriding;

public class Ustabası extends Isci {


   public String statu = "Ustabası";
  public   String haklar = "Ustabası haftada 1 gun extra hakkına sahıptır";

    public void mesai() {
        System.out.println("Arıza varsa ustabası exra ucret almalıdır");
    }
    public void maasHesapla() {

        System.out.println("Ustabası 30 gun * 8 saat * 10 euro=" + (30 * 8 * 10) + "Euro maas");
    }
    public static void main(String[] args) {
          /*
          Icinde oldugumuz Class'dan klasik haliyle bir obje olusturursak
          o obje ile cagirdigimiz variable ve method'larda
          Java once icinde bulundugumuz class'a bakar
          aradigimiz class uyesi, icinde oldugumuz class'da varsa
          bize onu getirir
          YOKSA,
          parent class(lar)a bakar, ilk buldugunu getirir
         */
        Ustabası yasin=new Ustabası();
        System.out.println(yasin.statu);
        System.out.println(yasin.haklar);
        System.out.println(yasin.ikramiye);
        System.out.println(yasin.izin);
        yasin.maasHesapla();
        yasin.mesai();
         /*
            Eger isci olarak ozelliklerini gormek istersek
            Class adini (Data Turu) Isci seceriz
         */
        Isci ahmet=new Ustabası();
        System.out.println(ahmet.statu);
        System.out.println(ahmet.haklar);
        System.out.println(ahmet.ikramiye);
        System.out.println(ahmet.izin);
        ahmet.maasHesapla();
        ahmet.mesai();
         /*
        Siz bir objeyi hangi class'dan tanimlarsaniz o class'a ait ozelliklere sahip olur
         */
        Personel adem= new Ustabası();
        System.out.println(adem.statu);
        System.out.println(adem.haklar);
        //System.out.println(adem.ikramiye);
        System.out.println(adem.izin);
        adem.maasHesapla();
        adem.mesai();
         /*
        Personel adem=new Ustabasi(); Bu bir Ustabasi objesidir
        Ustabasi 30 gun * 8 saat * 12 euro = 2880 Euro maas alir
        Ariza varsa Ustabasi ekstra ucret almadan calisir
        Personel adem=new Personel(); Bu Personel objesidir


        Personel adem=new Ustabasi();
        adem'in data turu Personel'dir.
                boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'in ustabasi oldugunu biliyorum
        cunku constructor'i Ustabasi
        Ama bu yazim formati ile
        adem'in tum Personel ile birlikte sahip oldugu
        ortak ozellikleri vurgulamak istiyorum
        Bu kullanim seklinde olusturulan obje data turu olarak secilen class
        ve onun parent class'larindaki variable'lari kullanabilir.
         */

    }


}
