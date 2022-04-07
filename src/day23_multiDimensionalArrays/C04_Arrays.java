package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        //kullanıcıdan kac elementlık bır array olusturacagını sorun
        //arrayı olusturup elementlerı kullanıcıdan alıp
        //array e atayın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen kac elementlı bır array istedıgınızı yazınız");

        int uzunluk= scanner.nextInt();

        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin"+i+1+"elemanı gırınız");
            arr[i]= scanner.nextInt();



        }
        System.out.println(Arrays.toString(arr));


    }
}
