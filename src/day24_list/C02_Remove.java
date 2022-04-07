package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);// [Aykut, Yusuf, Ilker, Oguzhan]

        // remove (istenenObject) method'u istenen elementi kaldirip
        // bize true/false doner.
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        // method'u boolean bir variable'a atayabilirsiniz

        boolean sonuc =isimler.remove("Oguzhan");//true

        // sonucu kullaniciya yazdirmak isterseniz
        if (sonuc==true){
            System.out.println("ıstedıgınız ısım sılındı");
        }else {
            System.out.println("ıstedıgınız ısım lıstede olmadıgından sılınemedı");

            // remove(index) yazdigimizda sildim/silmedim ihtimali kalmaz
            // bize remove edilen elemneti doner
        }
        System.out.println(isimler);



        sonuc=isimler.remove("Berk");

        if (sonuc==true){
            System.out.println("ıstedıgınız ısım sılındı");
        }else {
            System.out.println("ıstedıgınız ısım lıstede olmadıgından sılınemedı");


        }
        System.out.println(isimler.remove(1));//Yusuf u sıler ve bıze delıl olarak Yusuf ismini bize dondurur

        // yazdirsak da yazdirmasak da liste degisti ve 1.index'deki element silindi
        System.out.println(isimler);
        // [Aykut, Ilker]




    }
}
