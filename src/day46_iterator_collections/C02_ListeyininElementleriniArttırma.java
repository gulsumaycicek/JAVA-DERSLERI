package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_ListeyininElementleriniArttırma {

    // verilen listadeki her elementi 3 arttırın

    public static void main(String[] args) {


        List<Integer> Liste = new ArrayList<>();


        Liste.add(5);
        Liste.add(7);
        Liste.add(8);
        Liste.add(6);
        Liste.add(9);

        System.out.println(Liste);
/*
       ListeIte itr=Liste.iterator();


        while (itr.hasNext()){



           Object sayi=itr.next();
           itr.set((Integer)sayi+3);

        }
        System.out.println(Liste);

 */




    }
}
