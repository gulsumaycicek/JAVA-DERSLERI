package day04_dataCasting_Increrment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayı1=879;
        double sayı2=10;

        double sayı3=sayı1/sayı2;
        System.out.println(sayı3);

        int sayı4= (int) (sayı1/sayı2);

        System.out.println(sayı4);

        int sayı5=140;
        byte sayı6=(byte) sayı5;
        System.out.println(sayı6);
    }
}
