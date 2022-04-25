package day45_interfacea;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

    public static void main(String[] args) {

        List<Integer> Liste=new ArrayList<>();


        Liste.add(5);
        Liste.add(7);
        Liste.add(8);
        Liste.add(6);
        Liste.add(9);

        for (Integer each:Liste
             ) {
            each=each+2;


        }
        System.out.println(Liste);

        Iterator itr= Liste.iterator();

    }
}
