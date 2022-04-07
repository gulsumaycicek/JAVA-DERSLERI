package day05_matematikselişlemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

        short sayı1=20;
        Short sayı2=30;

        sayı1=sayı2;
        System.out.println(sayı1);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.BYTES);


    }
}
