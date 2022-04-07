package day25_lists;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class C04_LıstedenTekrarlıElemetlrıSilme {
    public static void main(String[] args) {

        //verılen bır lıstede tekrar eden sayıları sadece bır kere yazdıran bır metod yazdırın
        //orn: [1,3,5,3,5,6,1,7]
        // output [1,3,5,6,7]

        List<Integer> sayılar = new ArrayList<>();

        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(1);
        sayılar.add(7);

        tekrarsızLısteOlustur(sayılar);


    }

    public static void tekrarsızLısteOlustur(List<Integer> sayılar) {

        List<Integer> tekrarsızList = new ArrayList<>();

        for (int i = 0; i < sayılar.size(); i++) {

            if (tekrarsızList.contains(sayılar)) {

            }

        }
    }
}
