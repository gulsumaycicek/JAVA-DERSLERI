package day18_NestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        // kullanicidan bir rakam carpim tablosu olusturalim

        // 1 2 3         1*1  1*2  1*3
        // 2 4 6         2*1  2*2  2*3
        // 3 6 9         3*1  3*2  3*3




        int input=3;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input; j++) {

                System.out.print((i*j) +" ");

            }
            System.out.println(" ");

        }

    }

    public static class CO3_NestedForLoop {
        public static void main(String[] args) {

            // Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //    *
          //  * *
          //  * * *
          //  * * * *

            int input=5;
            for (int i =1; i <=input; i++) {
                for (int j = 1; j <=i; j++) {

                    // nested for loop ya diktorgen veya ucgen formatinda olabilir
                    // diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
                    // ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz



                    System.out.print("*");

                }
                System.out.println("");
            }




        }
    }
}
