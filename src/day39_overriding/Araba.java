package day39_overriding;

public class Araba {
   protected String hareket="Arabalar teker ile hareket eder";
   protected String hız="Arabalar motor gucune göre hız yaparlar";
   protected String yakit="Arabalar farklı yakıt kullana bılırler";
  protected   String marka="Arabalar uretıldıklerı markaya sahiptir";


    public void motor(){
        System.out.println("Arabalar farklımarkalar da motor kulllanırlar");
    }
    public void yakıtTuketım(){
        System.out.println("aranbalar motor gucu ve yakıt turune gore yakıt tuketırler");
    }


}
