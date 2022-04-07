package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C09_Deneme {
    public static void main(String[] args) {


        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(1);
        sayılar.add(2);
        sayılar.add(3);
        sayılar.add(4);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(7);

        int toplam=0;
        int ortalama=0;

        for (int i = 0; i < sayılar.size() ; i++) {
            toplam+= sayılar.get(i);

            ortalama=toplam/ sayılar.size();
            System.out.println(ortalama);

            List<Integer>ortalamanınUzerındekıler=new ArrayList<>();

            for (int i1 = 0; i < sayılar.size() ; i++) {
                if (sayılar.get(i)>ortalama){
                    ortalamanınUzerındekıler.add(sayılar.get(i));
                }
                }



        }
            System.out.println(ortalama);

    }
}

