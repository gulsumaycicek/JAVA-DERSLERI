package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanılanHarfSayısınıBulma {
    public static void main(String[] args) {


        String input = "Helloo";
        String harflerArr[]=input.split("");
        Map<String,Integer> kullanımSayıları=new HashMap<>();
/*
        for (int i = 0; i < harflerArr.length ; i++) {
            if (kullanımSayıları.containsKey(harflerArr[i]));
            kullanımSayıları.put(harflerArr[i], kullanımSayıları.get(harflerArr[i])+1);


 */

        for (String each:harflerArr
             ) {
            if (kullanımSayıları.containsKey(each)){
                kullanımSayıları.put(each, kullanımSayıları.get(each)+1);
            }else {
                kullanımSayıları.put(each,1);
            }

        }
        System.out.println(kullanımSayıları);


        }
    }

