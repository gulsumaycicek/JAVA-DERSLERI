package day_12stringManipulation;

public class C03_contains {
    public static void main(String[] args) {

    //    Soru 1) Kullanicidan email adresini girmesini isteyin,
        //    mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        //    @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        //    @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

      String email="mülkıyeayboy@gmail.com";

        String arananmetın="@gmail.com";

        if (!email.contains(arananmetın)){

            System.out.println("lutfen gmail adresi giriniz");

        }else if (email.lastIndexOf(arananmetın)==(email.length()-10)){

            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("lutfen yazımı kontrol edın");
        }
    }
}
