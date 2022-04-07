package day13_stringManipulation;

public class C05_Deneme {
    public static void main(String[] args) {
        //Java ogrenmek123 cok guzek@ //Java ogrenmek cok guzel =yazdırma

        String str = "Java ogrenmek123 Cok guzel@";
        str = str.replace("ogrenmek123", "ogrenmek");
        str = str.replace("guzel@", "guzel");
        System.out.println(str);

        String str1 = "13.99";
        String str2 = "10.55";
        System.out.println(Double.parseDouble(str1)+Double.parseDouble(str2));

    }
}