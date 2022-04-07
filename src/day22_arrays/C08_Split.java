package day22_arrays;

public class C08_Split {
    public static void main(String[] args) {

        //verılen bır cumlede ıstenen bır harfı kac defa kullandıgını yazdıran bır method olusturun

        String cumle="Nerede o hello word yazdıramayan ogrencıler";
        String harf="e";

        harfKacKereKullanılmıs(cumle,harf);
    }

    private static void harfKacKereKullanılmıs(String cumle, String harf) {

        int sayac =0;
        String karekterler[]=cumle.split("");

        for (int i = 0; i <karekterler.length ; i++) {
            if (karekterler[i].equals(harf));
            sayac++;



        }
        System.out.println("aradıgınız"+harf+"verılen cumle"+sayac+"adwt kullanılmıs");
    }
}
