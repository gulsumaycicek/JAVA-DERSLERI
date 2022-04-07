package day25_lists;

import java.util.Arrays;

public class C12_H2 {
    public static void main(String[] args) {



        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
         */

        int arr[][]={{10,20,30},{4},{6,7,20}};

        int toplam0=0;
        int toplam1=0;
        int toplam2=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                switch (i){
                    case(0):
                        toplam0+=arr[i][j];
                        break;
                    case (1):
                            toplam1+=arr[i][j];
                            break;
                    case (2):
                        toplam2+=arr[i][j];
                        break;

                        }

                }


            }
        int arrNew[]={toplam0,toplam1,toplam2};
        System.out.println(Arrays.toString(arrNew));

        }


    }

