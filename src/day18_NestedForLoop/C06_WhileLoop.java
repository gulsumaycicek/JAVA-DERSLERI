package day18_NestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun


        int baslangıc=40;
        int bıtıs=60;

        for (int i = baslangıc; i <=bıtıs ; i++) {
            System.out.print(i+" ");



        }
        System.out.println("");

        //Aynı soruyu while loop ile yapalım
        int i=baslangıc;

        while (i<=bıtıs){

            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.println("baslangıc");
    }
}
