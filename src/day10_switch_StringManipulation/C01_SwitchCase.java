package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen kacıncı ay oldugunu gırınız");
        int aYno= scanner.nextInt();
        switch (aYno){
            case 1:
                System.out.println("ocak");break;
            case 2:
                System.out.println("subat");break;
            case 3:
                System.out.println("mart");break;
            case 4:
                System.out.println("nısan");break;
            case 5:
                System.out.println("Mayis");break;
            case 6:
                System.out.println("Haziran");break;
            case 7:
                System.out.println("Temmuz");break;
            case 8:
                System.out.println("Agustos");break;
            case 9:
                System.out.println("Eylul");break;
            case 10:
                System.out.println("Ekim");break;
            case 11:
                System.out.println("Kasim");break;
            case 12:
                System.out.println("Aralik");break;
            default:
                System.out.println("lutfen gecerlı bır ay gırınız");

                // switch icine yazilan variable'in degerine gore
                // ilgili case'i bulur ve break gorene kadar kodu calistirir
                // eger break yoksa ilgili case'den asagi dogru tum case'ler calisir
                // if else'deki son else gibi, geriye kalan durumlari tamamen
                // kapsayacak bir satir daha ekleyebiliriz
        }
    }
}
