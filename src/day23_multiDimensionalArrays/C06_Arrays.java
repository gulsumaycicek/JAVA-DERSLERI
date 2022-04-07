package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {

        //verilen bır arraye yenı bır element ekleyen
        //bır methot olusturun

        int arr[] = {3, 5, 7};
        int eklenecekElement = 4;

        arr = arananElemanEkle(arr, eklenecekElement);
        arr=arananElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));


    }

    private static int[] arananElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            yeniArray[i] = arr[i];


        }
        yeniArray[yeniArray.length - 1] = eklenecekElement;
        return yeniArray;
    }
}







