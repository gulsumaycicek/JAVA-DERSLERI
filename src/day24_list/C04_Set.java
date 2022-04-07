package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);// [Aykut, Yusuf, Ilker, Oguzhan]

        isimler.set(1,"Seckin");//Yusuf gıttı yerıne Seckın geldı
        System.out.println(isimler);//[Aykut, Seckin, ilker, Oguzhan]

        List<String>logListesı=new ArrayList<>();

       logListesı.add(isimler.set(2,"Cosmos"));

        System.out.println(isimler);//[Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logListesı);//[ilker]


    }
}
