package day23_multiDimensionalArrays;

import java.util.Scanner;

public class C07_Arrrays {
    public static void main(String[] args) {


       // Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println( "lutfen bır cumle gırınız");
        String cumle= scanner.nextLine();


        String arr[]=cumle.split(" ");
        System.out.println("gırdıgınız cumledekı kelıme sayısı:"+arr.length);


    }
}
