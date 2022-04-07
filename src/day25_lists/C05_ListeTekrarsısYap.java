package day25_lists;

import java.util.ArrayList;
import java.util.List;

import static day25_lists.C04_LıstedenTekrarlıElemetlrıSilme.tekrarsızLısteOlustur;

public class C05_ListeTekrarsısYap {
    public static void main(String[] args) {

        //verılen bır lıstede tekrar eden sayıları sadece bır tane yapan bır metod yazdırın
        //orn: [1,3,5,3,5,6,1,7]
        // Yenılist [1,3,5,6,7]

        List<Integer> sayılar = new ArrayList<>();

        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(6);
        sayılar.add(1);
        sayılar.add(7);

        sayılar=tekrarsızLısteOlustur1(sayılar);

    }

    private static List<Integer> tekrarsızLısteOlustur1(List<Integer> sayılar) {




    List<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i <sayılar.size() ; i++) {
            if (!tekrarsizList.contains(sayılar.get(i))){
                tekrarsizList.add(sayılar.get(i));
            }
        }
        return tekrarsizList;
    }


}


