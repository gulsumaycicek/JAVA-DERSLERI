package day19_doWhileLoop;

public class C07_Deneme {
    public static void main(String[] args) {
        // girilen sayının basamaklarını başkanımların toplamını bulun.


        int input = 9876;
        int rakam = 0;
        int rakamlartoplamı = 0;


        while (input>0){
            rakam=input%10;
            rakamlartoplamı+=rakam;
            input/=10;

        }
        System.out.println(rakamlartoplamı);


    }

    }















