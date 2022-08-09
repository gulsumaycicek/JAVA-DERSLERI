package DepoProjesi;

import java.util.Scanner;

public class TryCatch extends Islem {


    static Scanner sc = new Scanner(System.in);

    static int intGirisi() {
        int giris = 0;
        boolean flag = true;
        boolean flag2 = false;

        do {
            try {
                if (flag2 == true) { // Dummy1 çalışmadan exception verdigi için sürekli satır atlıyordu.
                    // bu yüzden ilk seferde çalışmayan sonrasında çalışan bir dummy yaptım.
                    sc.nextLine(); // Dummy2
                }
                flag2 = true;
                giris = sc.nextInt();
                sc.nextLine();
                flag = false;
                flag2 = false;
            } catch (Exception e) {
                System.out.println("Lütfen RAKAM'lardan oluşan bir giriş yapınız.");
            }
        } while (flag);


        return giris;
    }

    static String stringGirisi() {
        String giris = "";
        boolean flag = true;

        do {
            giris = "";
            try {
                giris = sc.next();
                sc.nextLine();        //Dummy1
                flag = false;
            } catch (Exception e) {
                System.out.println("lütfen HARF'lerden oluşan bir giris yapınız");
            }
        } while (flag);
        return giris;
    }

    static Depo objeGirisi(){

        return new Depo( stringGirisi() ,stringGirisi(), intGirisi(),stringGirisi(), intGirisi());

    }
    static boolean idBul(int istenenID){

        if (urunler.keySet().contains(istenenID)){
            idVarMi=true;
        }else{
            idVarMi=false;
        }
        return idVarMi;
    }

    static void baskaIslemSor() {
        System.out.println("_____________________________________________________");
        System.out.println("Başka bir işlem yapmak istiyor musunuz?");
        System.out.print("Devam etmek için 1,\t çıkış yapmak için 2 ye basınız. ");
        int secim = intGirisi();
        if (secim == 1) {
            islemlerMenu();
        } else if (secim == 2) {
            cıkıs();
        } else {
            System.out.println("Lütfen 1 ve ya 2 ye basınız : ");
            baskaIslemSor();
        }

    }
}
