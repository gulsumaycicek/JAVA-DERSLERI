package day04_dataCasting_Increrment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayı=20;

        System.out.println(sayı+10);

        sayı=sayı+10;
        System.out.println(sayı=sayı+10);
        System.out.println(sayı+10);

        System.out.println(sayı++);
        System.out.println(sayı);

    }

    public static class C01_PrelncrementPostincrement {
        public static void main(String[] args) {

            int sayı=10;

            sayı++;

            System.out.println(sayı);

            sayı++;

            System.out.println(sayı);

            System.out.println(++sayı);

            System.out.println(sayı);

            System.out.println(sayı++);
            System.out.println(sayı);

        }
    }
}
