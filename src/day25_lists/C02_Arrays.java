package day25_lists;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir array olarak yazdiran bir method olusturun



        int arr[]={3,4,5,2,3,5,7,3,8,5,2,4};

        int istenmeyenElement=3;

        istenmeyenElementiSil(arr,istenmeyenElement);




    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenElement) {

        //1- istenmeyen element sayisini bulalim
        
        int sayaç=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==istenmeyenElement){
                sayaç++;
                
                
            }
            
        }

        // 2- yeni arrayi olusturalim
        
        int arrYenı[]=new int[arr.length-sayaç];

        // 3- eski arry'den uygun elementleri yeniye tasi

        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenElement){
                arrYenı[index]=arr[i];
                index++;

            }
            
        }
        // 4- yeni array'i yazdiralim
        System.out.println(Arrays.toString(arrYenı));






    }
}
