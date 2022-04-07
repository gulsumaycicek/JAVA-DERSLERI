package day24_list;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {
    public static void main(String[] args) {

        /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen kac sayı gırecegınızı yazınız");
        int arrElemanSayisi = scanner.nextInt();
        int arr[] = new int[arrElemanSayisi];

        for (int i = 0; i < arr.length ; i++) {
            System.out.print((i+1) + ". elemani giriniz : ");
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int fark = arr[arr.length-1]-arr[0];
        System.out.println("Olusturdugunuz dizide en buyuk ile en kucuk eleman arasindaki fark : "+fark);






    }
}
