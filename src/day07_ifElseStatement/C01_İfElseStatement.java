package day07_ifElseStatement;

public class C01_İfElseStatement {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {
            System.out.println("Verilen sayilar esittir");
        }

        if (a < 100) {
            System.out.println("a yuzden kucuktur");
        }

        if (a * b > 5) {
            System.out.println("Sayilarin carpimi 5 den buyuk");
        }
        /*bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        bir sart ve o sarta bagli sonuca odaklidir.
        birden fazla if cumlesinin badisi calisabilecegi gibi
        hicbir if badisi calismayabilirde.
         */

    }
}
