package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_İstenenElemanlarıSilme {
    public static void main(String[] args) {

        /*
Soru 3) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …                                             (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]

 */

        List<Integer> Liste = new ArrayList<>();


        Liste.add(2);
        Liste.add(13);
        Liste.add(56);
        Liste.add(23);
        Liste.add(45);
        Liste.add(14);
        Liste.add(40);

        ListIterator itr=Liste.listIterator();

        while (itr.hasNext()){
            Object sayı=itr.next();
            if ((Integer)sayı<20|| (Integer)sayı>40){
                itr.remove();
            }
        }
        System.out.println(Liste);

    }
}
