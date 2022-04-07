package day34_accesModifier_encapsulation;

public class C01 {

    private static int sayı = 10;
    private static String str = "Java";
    static int aciksayı = 20;
    String acikString = "Hi";
    public static  int halkaAcikSayi=15;
    protected static int aileyeOzel=40;

     protected C01() {

         // bu constructor'in access modifier'i
         // default access modifier'dir
         // dolayisiyla icinde oldugumuz paketin disinda
         // bu class'dan obje olusturulamaz


    }
    C01(int numara){
        System.out.println("paremetrelı costtaktır calısır");

}

    private void  method1(){

    }
}
