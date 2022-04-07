package day_12stringManipulation;

public class C04_endsWich {
    public static void main(String[] args) {

        //   Soru 1) Kullanicidan email adresini girmesini isteyin,
        //    mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        //    @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        //    @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin


        String email = "mülkıyeayboy@gmail.com";

        String arananmetın = "@gmail.com";

        if (!email.contains(arananmetın)) {

            System.out.println("lutfen gmail adresi giriniz");

        } else if (email.endsWith(arananmetın)) {

            System.out.println("Email adresiniz kaydedildi");

        } else {
            System.out.println("lutfen yazimi kontol edin yazdirin");
        }
    }
}