package day15_methotCreation;

public class C06_MethotCreation {
    public static void main(String[] args) {

        int a=10;

        int b=20;

        ikiSayıTopla(a,b);
        // iki variable'in degerlerini toplayan bir method olusturalim
        // 1.adim : method adini yazalim
        // 2.adim : method'a gondermem gereken argument var mi ?
        ikiSayiTopla(25,50);
        C04.dortHarfiTersineCevir("sema");
    }
    // bir method'u olusturmak calismasi icin yeterli degildir
    // method ancak cagrilirsa calisir
    // ayni class veya farkli class'da olmasinin hic bir onemi yoktur
    // Java main method'da yukaridan asagiya dogru calisir
    // ve geldigi satiri calistirir
    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : " + (a+b));
    }





    public static void ikiSayıTopla(int a, int b) {
        System.out.println("verılen ıkı sayının toplamı:"+(a+b));

    }
}
