package day25_lists;

import java.util.Arrays;

public class C13_H3 {
    public static void main(String[] args) {

          /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */

        int arr[]={1,2,-3,4,-5,-6};

        int sonuc[]=arrayeksibirlecarp(arr);
        System.out.println(Arrays.toString(sonuc));
    }
    private static int[] arrayeksibirlecarp(int arr[] ) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i]*=-1;
        }
        return arr;
    }
}
