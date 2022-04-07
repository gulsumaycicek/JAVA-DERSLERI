package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListdenİstenmeyenElemetlerıSilme {
    public static void main(String[] args) {

        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir array olarak yazdiran bir method olusturun




        int arr[]={3,4,5,2,3,5,7,3,8,5,2,4};

        int istenmeyenElement=5;

        istenmeyenElementiSilveYazdır(arr,istenmeyenElement);

    }

    public static void istenmeyenElementiSilveYazdır(int[] arr, int istenmeyenElement) {

        List<Integer>yenıList=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]!=istenmeyenElement){
                yenıList.add(arr[i] );
            }


        }
        System.out.println(yenıList);


    }
}
