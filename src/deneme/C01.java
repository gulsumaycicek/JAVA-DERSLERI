package deneme;

import java.util.*;

public class C01 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm1 = new HashMap<>();

        hm1.put(100, "Ali");
        hm1.put(101, "Veli");
        hm1.put(102, "Erva");
      //  hm1.put(null, "Zeynep");

        Hashtable<Integer, String> hm2 = new Hashtable<>();
       /* hm2.put(null,"Ayse");
        System.out.println(hm2);

        */

        HashMap<Integer, String> hm3 = new HashMap<>();


        hm3.put(80, "X");
        hm3.put(81, "Y");
        hm3.put(82, "E");

        hm1.putAll(hm3);
        System.out.println(hm1);//{null=Zeynep, 80=X, 81=Y, 82=E, 100=Ali, 101=Veli, 102=Erva}

        hm1.putIfAbsent(105, "Z");//{null=Zeynep, 80=X, 81=Y, 82=E, 100=Ali, 101=Veli, 102=Erva, 105=Z}
        System.out.println(hm1);

        hm1.putIfAbsent(105, "R");//{null=Zeynep, 80=X, 81=Y, 82=E, 100=Ali, 101=Veli, 102=Erva, 105=Z}
        System.out.println(hm1);// Varsa eklemez

        String deger = hm1.get(105);
        System.out.println(deger);//Z  key in values ını getırır

        String deger2 = hm1.getOrDefault(999, "boyle bir key yok");
        System.out.println(deger2);//Yoksa mesajı getırır ,varsa values ını getırır

        Set<Integer> key = hm1.keySet();
        Collection<String> values = hm1.values();
        System.out.println(values);//{null=Zeynep, 80=X, 81=Y, 82=E, 100=Ali, 101=Veli, 102=Erva, 105=Z}
        System.out.println(key);//[null, 80, 81, 82, 100, 101, 102, 105]

        Set<Map.Entry<Integer, String>> entry = hm1.entrySet();

        for (Map.Entry<Integer, String> each : entry
        ) {
            System.out.println(each);//key ve values lerı bırlıkte getırır
        }

        for (Map.Entry<Integer, String> each : entry
        ) {

            System.out.println(each.getKey());//key lerı getırır

        }
        for (Map.Entry<Integer, String> each : entry
        ) {

            System.out.println(each.getValue());//values lerı getırır
        }

        boolean varmı = hm1.replace(200, "M", "N");
        System.out.println(varmı);//false

        boolean varmı1 = hm1.replace(105, "Z", "N");
        System.out.println(varmı1);//true

        String values5=hm1.remove(100);//Sildigi degeri getirir
        System.out.println(values5);
        System.out.println(hm1);

        boolean silindimi=hm1.remove(102,"Erva");
        System.out.println(silindimi);

        boolean silindimi1=hm1.remove(101,"R");
        System.out.println(silindimi1);

        System.out.println(hm1);

        TreeMap<Integer,String> tm1=new TreeMap<>(hm1);
        System.out.println(tm1);//{80=X, 81=Y, 82=E, 101=Veli, 105=N}



    }
}


