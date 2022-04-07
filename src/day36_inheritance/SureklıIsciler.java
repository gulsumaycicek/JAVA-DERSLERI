package day36_inheritance;

public class SureklıIsciler extends Isci {
    @Override
    public String toString() {
        return "SureklıIsciler{" +
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

    public static void main(String[] args) {


        SureklıIsciler surIc1 = new SureklıIsciler();
        surIc1.persNo=5001;
        surIc1.isim="Cem";
        surIc1.soyisim="Akay";
        surIc1.statu="Iscı";
        surIc1.saatUcreti=11;
        surIc1.maas= surIc1.maasHesapla();
        System.out.println(surIc1);


    }
}
