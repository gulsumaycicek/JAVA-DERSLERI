package day17_forLoop;

public class C04_ForLoop {

    public static void main(String[] args) {

        // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin


        for (int i =10; i <=30 ; i++) {
            System.out.print(i+",");


            int baslangıc=10;
            int bıtıs=30;
            for (int i1 =baslangıc; i <=bıtıs ; i++) {

                if (i<bıtıs){
                    System.out.println(i+",");
                }else {
                    System.out.println(i);
                }

            }

        }
    }
}
