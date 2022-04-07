package day09_ternary_Switch;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {


         /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim


        byte byteMax=Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);

        byte bytMin=Byte.MIN_VALUE;
        System.out.println("bytMin = " + bytMin);

        short shortMax=Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        
        short shortMin=Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);

        float laptopFiyat=9999.99f;
        double kilimetre=579.6;
        char cinsiyet='E';
        boolean dogtuMu=true;
        System.out.println("laptopFiyat = " + laptopFiyat);
        System.out.println("kilimetre = " + kilimetre);
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("dogtuMu = " + dogtuMu);
    }
}
