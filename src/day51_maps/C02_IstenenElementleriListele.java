package day51_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenElementleriListele {




    /* Soru 2 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
        mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
        Istenen dil è java
        Sonuc è [Ali, Veli]
        public static void main(String[] args) {

        */
   public static void main(String[] args) {
    Map<Integer,String>sinifMap= MapOlustur.myMap();

    String istenenDil="Java";
       List<String> istenenDiliBilenlerListesi=istenenDiliBilenListesiOlustur(sinifMap,istenenDil);




   }

    public static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMap, String istenenDil) {

       List<String> istenenDiliBilenlerListesi=new ArrayList<>();


        return istenenDiliBilenlerListesi;
    }

}


