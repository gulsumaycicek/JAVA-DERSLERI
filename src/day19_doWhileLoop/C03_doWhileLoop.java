package day19_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {

        int input=3;



        int sayı=1;



        while (sayı<input){
            System.out.println(sayı);

            sayı++;
        }
        sayı=1;

        do {
            System.out.println(sayı);
            sayı++;
        }while (sayı<input);


    }
}
