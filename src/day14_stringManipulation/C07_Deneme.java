package day14_stringManipulation;

public class C07_Deneme {
    public static void main(String[] args) {



       // Dize seklinde verilen asagidaki fiyatlarin toplamini bulun.
       //         Dize str 1= %13.99
      //  Dize str 2= %10.55
      //  ucu: Double.parseDouble() methodunu kullanarak.


         String str1="%13.99";
          String str2="%10.55";


          str1=str1.replaceAll("\\D","");
        System.out.println(str1);
        str2=str2.replaceAll("\\D","");
        System.out.println(str2);

        System.out.println(str1+str2);


        double sayı1=Double.valueOf(str1);
        double sayı2=Double.valueOf(str2);
        double toplam=(sayı1+sayı2)/100;
        System.out.println("$"+toplam);
    }
}
