package day46_iterator_collections;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {

    public static void main(String[] args) {


        List<Integer> Liste=new ArrayList<>();


        Liste.add(5);
        Liste.add(7);
        Liste.add(8);
        Liste.add(6);
        Liste.add(9);

        System.out.println(Liste);

        Iterator itr= Liste.iterator();

        System.out.println(itr.hasNext());//true

        System.out.println(itr.next());// 5
        System.out.println(itr.next());// 7
        itr.remove();// 5 8 6 9
        System.out.println(Liste);
      //  itr.remove();


    }
}
