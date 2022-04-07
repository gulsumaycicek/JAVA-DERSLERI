package day17_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
        // Ancak;
        //Sayi 3’un kati ise sayi yerine “Java” yazdirin.
         //  Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
         // Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.


        int sayı=60;

        for (int i =1; i <=sayı ; i++) {

            if (i%3==0&& i%5==0){
                System.out.println("Java");

            }else if (i%3==0){
                System.out.println("guzeldır");

            }else if (i%5==0){
                System.out.println("Java guzeldır");

            }else {
                System.out.print(i+" ");
            }

        }



    }



}
