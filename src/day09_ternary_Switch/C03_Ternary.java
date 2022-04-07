package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayı=876;

       String sonuc= sayı>100 ?"Sayı 3 basamaklı veya daha büyük": "sayı negatif veya 3 basamaktan kucuk";
        System.out.println("girdiğiniz sayı analizi"+ sonuc);
    }
}
