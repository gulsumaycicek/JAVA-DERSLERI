package day36_inheritance;

public class Ustabası extends Isci{



        public static void main(String[] args) {
            Ustabası ustabasi1=new Ustabası();
            ustabasi1.saatUcreti=15;
            ustabasi1.isim="Murat";
            ustabasi1.soyisim="Gokcek";
            ustabasi1.maas=ustabasi1.maasHesapla();
            ustabasi1.statu="Isci";
            ustabasi1.isciStatu="Ustabasi";
            System.out.println(ustabasi1);
        }
        @Override
        public String toString() {
            return "Ustabasi{" +
                    "isciStatu='" + isciStatu + '\'' +
                    ", saatUcreti=" + saatUcreti +
                    ", statu='" + statu + '\'' +
                    ", maas=" + maas +
                    ", persNo=" + persNo +
                    ", isim='" + isim + '\'' +
                    ", soyisim='" + soyisim + '\'' +
                    ", adres='" + adres + '\'' +
                    ", tel='" + tel + '\'' +
                    '}';


    }
}
