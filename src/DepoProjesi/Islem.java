package DepoProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Islem  extends Depo{

    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Depo> urunler = new HashMap<>();
    static Set<Map.Entry<Integer, Depo>> sF = urunler.entrySet();
    static int id = 999;
    static boolean idVarMi;
    static void islemlerMenu() {
        System.out.println("========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-URUN LISTESI    |            | 2-URUN TANIMLA      |  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3-RAF GUNCELLEME  |            | 4-MİKTAR GUNCELLEME |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-URUN CIKISI     |            | 6-CIKIS             |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯      \n ");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        int secim = TryCatch.intGirisi();
        switch (secim) {
            case 1:
                urunListele();
                break;
            case 2:
                urunTanımla();
                break;
            case 3:
                rafGuncelle();
                break;
            case 4:
                miktarGuncelle();
                break;
            case 5:
                urunCıkıs();
                break;
            case 6:
                cıkıs();
                break;
            default:
                System.out.println("Lütfen 1 ve 6 arasında bir giriş yapınız.");
        }
    }
    private static void rafGuncelle() {
        System.out.println("====================== Raf Güncelleme ===============");
        System.out.println("Lütfen rafını güncellemek istediğiniz ürünün ID sini giriniz.");
        int istenenID = TryCatch.intGirisi();
        if (TryCatch.idBul(istenenID)) {
            System.out.println("Lütfen koymak istediğiniz rafı giriniz.");
            urunler.get(istenenID).setRaf(TryCatch.intGirisi());
        } else {
            System.out.println("Aradığınız ID ye ait ürünümüz bulunmamaktadır.");
        }
        TryCatch.baskaIslemSor();
    }
    private static void miktarGuncelle() {
        System.out.println("====================== Miktar Güncelleme ===============");
        System.out.println("\nLütfen aradığınız ID yi yazınız.");
        int istenenID = TryCatch.intGirisi();
        if (TryCatch.idBul(istenenID)) {
            System.out.println("Lütfen artırmak ya da eksiltmek istediğiniz miktarı giriniz.");
            urunler.get(istenenID).setMiktar(urunler.get(istenenID).getMiktar() + TryCatch.intGirisi());
        } else {
            System.out.println("Aradığınız ID ye ait ürünümüz bulunmamaktadır.");
        }
        TryCatch.baskaIslemSor();
    }
    private static void urunTanımla() {
        System.out.println("====================== Ürün Tanımlama ===============");
        System.out.println("Lütfen SIRASIYLA  ürün ismi, üretici bilgisi, ürün miktarını, ürün birimini, ürün rafını giriniz.");
        urunler.put(++id, TryCatch.objeGirisi());
        TryCatch.baskaIslemSor();
    }
    private static void urunListele() {
        if (urunler.isEmpty()) {
            System.out.println("Depo boş olduğu için ürün listelenememektedir.");
            TryCatch.baskaIslemSor();
        } else {
            System.out.println("ID\t\tÜRÜN ADI\tÜRETİCİ\t\tMİKTARI\t\tBİRİMİ\t\tRAF\n" +
                    "-------------------------------------------------------------");
            for (Map.Entry<Integer, Depo> w : sF) {
                System.out.printf("%-10d %-10s %-10s %-10d %-10s %-10d\n",
                        w.getKey(), w.getValue().getIsim(), w.getValue().getUretici(), w.getValue().getMiktar(),
                        w.getValue().getBirimi(), w.getValue().getRaf());
                System.out.println("-------------------------------------------------------------");
            }
            TryCatch.baskaIslemSor();
        }
    }
    private static void urunCıkıs() {
        System.out.println("====================== Ürün Tamamen Silme ===============");
        System.out.println("Lütfen silmek istediğiniz ürünün ID sini giriniz.");
        int silinecekID = TryCatch.intGirisi();
        if (TryCatch.idBul(silinecekID)) {
            System.out.println("Bilgileri " + urunler.remove(silinecekID) + " olan ürün depodan tamamen silinmiştir.");
        } else {
            System.out.println("Aradığınız ID ye ait ürünümüz bulunmamaktadır.");
        }
        TryCatch.baskaIslemSor();
    }
    static void cıkıs() {
        System.out.println("Depo yönetim sisteminden çıkışınız yapılmıştır.");
    }
}
