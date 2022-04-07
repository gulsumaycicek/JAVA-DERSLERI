package day14_stringManipulation;

public class CO3_StringSayıtoplama {
    public static void main(String[] args) {

        String str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replaceAll("\\D", "");//1399 ama string olarak
        str2 = str2.replaceAll("\\D", "");//1055 ama string olarak

         double str1Sayı=Double.valueOf(str1);
         double str2Sayı=Double.valueOf(str2);

         double sonuc=(str1Sayı+str2Sayı)/100;
        System.out.println("verılen string sayıların toplamı:$"+sonuc);




    }
}