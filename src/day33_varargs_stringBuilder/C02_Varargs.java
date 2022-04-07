package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        // parametre olarak bir int
        // ve istedigimiz kadar String alan
        // en uzun kelimenin harf sayisi ile int parametre degerini
        // carpip sonucu yazdiran bir method olusturun


        int sayı = 5;
        String str1 = "ZUlal";
        String str2 = "Zeynep";

        carpim(sayı, str1, str2);

        // Bir method'da varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip, varargs'i en sona yazmaliyiz
        // Bu sebeple bir method'da birden fazla varargs olamaz

    }

    private static void carpim(int sayı, String... str) {

        String enUzunStr = "";

        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }

        }
        System.out.println("ıstenen deger:" + sayı * enUzunStr.length());
    }
}
