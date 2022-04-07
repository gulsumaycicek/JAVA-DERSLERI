package day11_StringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin




        Scanner scanner=new Scanner(System.in);
        System.out.println("derse katılmak ıstermısınız\n Evet veya Hayır yazdırın");
        String cevap= scanner.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevap:"+cevap+"derse katılımınız saglanmıstır");

        }else if (cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız:"+cevap+ "sonrakı derslerımıze beklerız");

        }else {
            System.out.println("lutfen evet veya hayır gırınız");
        }
    }
}
