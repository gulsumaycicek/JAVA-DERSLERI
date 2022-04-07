package day13_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Deneme {
    public static void main(String[] args) {

      String   str="Java guzeldır";
      String str2="java + guzeldır";

        System.out.println(str==str2);
        System.out.println(str.equals(str2));

        String str3=str=" ";
        System.out.println(str3==str2);
        System.out.println(str3.equals(str2));

        String str5="ERVA";
        String str6="erva";
        System.out.println(str5.equals(str6));
        System.out.println(str5==str6);
        System.out.println(str6.toUpperCase().equals(str5));

        System.out.println(str5.equalsIgnoreCase(str6));



      String str8="Java baska bır guzel";
      System.out.println(str8.indexOf('a'));
      System.out.println(str8.indexOf("ava"));
      System.out.println(str8.indexOf("bır"));
      System.out.println(str8.indexOf('a',5));

String str9="hersey guzel olacak";
      System.out.println(str9.replace('a','x'));
      System.out.println(str9.replace("guzel","xx"));
      System.out.println(str9.replaceAll(" ","x"));
    }
}
