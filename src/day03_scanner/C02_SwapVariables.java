package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

  /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */


        int sayı1=10;
        int sayı2=20;

        System.out.println("Swap dan önce sayı1;"+ sayı1+ "sayı2: "+ sayı2);

        int temp=sayı1;

        sayı1=sayı2;

        sayı2=temp;


        System.out.println("Swap dan sonra sayı1:"+sayı1 +", sayı2:"+ sayı2);


    }
}
