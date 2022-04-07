package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        //verilen bır arraye yenı bır element ekleyen
        //bır methot olusturun

        int arr[]={3,5,7};

       // arr[3]=8; array de olmayan bir index eatama yapamayız

       // arr={1,3,5,}; var olan bır array e aynı boyutta bıle olsa dırek yenı degerler iceren bir array e atayamayız

        arr =new int[4];//[0,0,0,0]
        System.out.println(Arrays.toString(arr));


        int arrYenı[]=new int[5];
        System.out.println(Arrays.toString(arr));//[0,0,0,0,0]

        arrYenı[0]=2;
        arrYenı[3]=5;

        arr=arrYenı;
        System.out.println(Arrays.toString(arr));//[2,0,0,5,0]



        // Bir array'e icinde hazir elementlerin oldugu yeni bir array atamak isterseniz
        // bunu {1,2,3} seklinde yazarak degil
        // new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz bir array'i
        // assign ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};
        arr= arrEnYeni;
        System.out.println(Arrays.toString(arr));





    }
}
