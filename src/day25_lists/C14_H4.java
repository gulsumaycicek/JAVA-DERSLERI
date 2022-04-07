package day25_lists;

import java.util.Scanner;

public class C14_H4 {
    public static void main(String[] args) {

        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen istenilen toplamı giriniz:");
        int toplam=scan.nextInt();

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        arrayikili(arr,toplam);

            }

    private static void arrayikili(int[] arr, int toplam) {

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {

                if (i!=j){
                    if (arr[i] + arr[j] == toplam) System.out.println("("+arr[i]+","+arr[j]+")");

            }

        }
    }

}

    }

