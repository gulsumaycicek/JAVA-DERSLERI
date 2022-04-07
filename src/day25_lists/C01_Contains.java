package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {




        List<String>harfler=new ArrayList<>();
        harfler.add("D");
        harfler.add("M");
        harfler.add(1,"T");
        harfler.add(0,"T");//[T, D, T, M]
        System.out.println(harfler);


        System.out.println(harfler.contains("T"));//true

        System.out.println(harfler.contains("F"));//false


        List<String>karekterler=new ArrayList<>();
        karekterler.add("M");
        karekterler.add("T");

        System.out.println( harfler.containsAll(karekterler));//true


        karekterler.add("F");
        System.out.println( harfler.containsAll(karekterler));//false





    }
}
