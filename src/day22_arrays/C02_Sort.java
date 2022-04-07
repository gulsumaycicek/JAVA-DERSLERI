package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,0,45,25,4,9,0};

        //Sort methodu olmadan yapalım

        int enKucukSayı=Integer.MAX_VALUE;
        int enBuyukSayı=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]<enKucukSayı){
                enKucukSayı=arr[i];

            }
            if (arr[i]>enBuyukSayı);
            enBuyukSayı=arr[i];

        }
        System.out.println("Arary dekı eb kucuk sayı:"+enKucukSayı);
        System.out.println("Array'deki en buyuk sayi : " + enBuyukSayı);

        Arrays.sort(arr);
        System.out.println("Array'deki en kucuk sayi : " + arr[0]);
        System.out.println("Array'deki en buyuk sayi : " + arr[arr.length-1]);


    }
}
