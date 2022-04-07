package day26_forEachloop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachloop {
    public static void main(String[] args) {

        int arr[] = {2, 5, 4, 6, 4, 9, 7, 1, 3, 10};

        List<Integer> sayılar = new ArrayList<>();


        for (int each : arr
        ) {
            sayılar.add(each);

        }
        System.out.println(sayılar);


        // sayilar listesinde 3'e bolunemeyen sayilari for-each loop ile yazdiralim

        for (int each : sayılar
        ) {
            if (each % 3 != 0) {
                System.out.print(each + " ");
            }
        }


    }
}

