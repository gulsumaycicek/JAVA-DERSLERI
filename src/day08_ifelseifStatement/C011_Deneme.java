package day08_ifelseifStatement;

import java.util.Scanner;

public class C011_Deneme {
    public static void main(String[] args) {


        // Kulanıcıdan aracının hızını alınız
        // Trafik cezasının değerini hesaplayın.
        // 45 hız sınırıdır.
        // Eğer hızınız 55-74 arasında ise:
        //  Ceza 100 $'dır.
        // Eğer hızınız 75 - 84 arasında ise:
        // Ceza 150 $'dır.
        // Eğer hızınız 85 -94 arasında ise:
        //Ceza 320 $'dır.
        // Eğer hızınız 94'den daha fazla ise:
        // Ceza 500 $'dır.
        //ve ayrıca,
        // Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
        // Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $  //

        Scanner scanner = new Scanner(System.in);
        System.out.println("ehliyetınız varsa 'V'yoksa'Y'harfini giriniz");
        char ehliyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("kullandıgınız aracın hızını gırınız");
        int hız = scanner.nextInt();

        if (ehliyet == 'V') {
            if (hız >= 55 && hız >= 74) {
                System.out.println("ceza dolardır dır");
            }
        } else if (hız > 75 && hız >= 84) {
            System.out.println("ceza 150 dolardır");
        } else if (hız >= 85 && hız >= 94) {
            System.out.println("caza 320 dolardır");
        } else if (hız >= 94) {
            System.out.println("ceza 500 dolardır");

        } else if (ehliyet == 'Y') {

            if (hız >= 55 && hız >= 74) {
                System.out.println("ceza 300 dolardır");
            }
        } else if (hız > 75 && hız >= 84) {
            System.out.println("ceza 350 dolardır");
        } else if (hız >= 85 && hız >= 94) {
            System.out.println("caza 520 dolardır ");
        } else if (hız >= 94) {
            System.out.println("ceza 700 dolardır");


        }else {
            System.out.println("lutfen V veye Y harflerını tuslayın" );
        }
    }
}