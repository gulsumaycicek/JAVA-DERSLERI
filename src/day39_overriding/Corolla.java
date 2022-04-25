package day39_overriding;

public class Corolla extends Toyota {


    protected String hız = "Coralla max 220 km hız yapar";
    protected String yakit = "Corplla benzinli ve elektırıklıdır";
     protected String model="Coralla";

    public void motor() {
        System.out.println("Coralla araclar cevrecı motor kullanırlar");
    }

    public void yakıtTuketım() {
        System.out.println("Coralla 5.6lt yakıt tuketırler");
    }

    public void vitesSayısı(){
        System.out.println("Coralla 5 viteslidir");


    }

    public static void main(String[] args) {
        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket); //araba
        System.out.println(arb1.hız); //Coralla
        System.out.println(arb1.yakit); //Coralla
        System.out.println(arb1.marka); //Toyota
        System.out.println(arb1.sirketMerkezi);//Toyota
        System.out.println(arb1.model); //Coralla
        arb1.motor();


        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket); //araba
        System.out.println(arb2.hız); //Toyota
        System.out.println(arb2.yakit); //Araba
        System.out.println(arb2.marka); //Toyota
        System.out.println(arb2.sirketMerkezi);//Toyota
       // System.out.println(arb2.model); //CTE
        arb2.motor();//Coralla
        arb2.garanti();// Toyota
        arb2.yakıtTuketım();//Coralla
       // arb2.vitesSayısı();



        Araba arb3=new Araba();
        System.out.println(arb3.hareket); //araba
        System.out.println(arb3.hız); //Araba
        System.out.println(arb3.yakit); //Araba
        System.out.println(arb3.marka); //Araba
       // System.out.println(arb3.sirketMerkezi);//CTE
        // System.out.println(arb3.model); //CTE
        arb3.yakıtTuketım();//Coralla
        arb3.motor();// Coralla
       // arb3.garanti();CTE
       // arb3.vitesSayısı();//CTE





    }
}
