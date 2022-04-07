package day26_forEachloop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachloop {
    public static void main(String[] args) {

        //ki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz


        String array1[]={"Ali","Ayse","Can","Fatma"};
        String array2[]={"Can","Evren","Emsal","Fatma","Emre"};


        List<String> ortakEleman=new ArrayList<>();

        for (String each1:array1
             ) {
            for (String each2:array2
                 ) {
                if (each1.equals(each2)){
                    ortakEleman.add(each1);
                }

            }

        }
        if (ortakEleman.isEmpty()){
            System.out.println("ortak eleman yok");
        }else {
            System.out.println("iki array dakı ortak elemanler:"+ ortakEleman);
        }
    }
}
