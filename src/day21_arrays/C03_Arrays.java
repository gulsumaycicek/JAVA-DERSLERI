package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[];  // deger atamasi yapmadik ama Java kabul etti ancak kullanmamiza izin vermez

        arr=new int[6];


        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
                                  // String deki length() , bunda yok


        // arraydeki her bir elemani index degeri kadar artiralim
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=i;

        }
        // son index'deki elementi yazdiralim
        System.out.println(Arrays.toString(arr));
    }
}
