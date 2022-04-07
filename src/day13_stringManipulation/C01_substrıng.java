package day13_stringManipulation;

public class C01_substrıng {
    public static void main(String[] args) {


        String str="Java ile ıt cok guzel";

        System.out.println(str.substring(5));

        System.out.println(str.replace("Java","mehmet hoca"));
        System.out.println(str.substring(9));
        System.out.println("mehmet hoca"+ str.substring(5));

        System.out.println(str.substring(0,5));//Java
        System.out.println(str.substring(0,1));//J
        System.out.println(str.substring(5,6));//i

        str="Java gun gectıkce guzellesıyor";
        System.out.println(str.substring(7,7));//hiclik dondurur

      //  System.out.println(str.substring(5,2));//hata verır

        System.out.println(str.substring(str.length()-1));//son harfı verır
        System.out.println(str.substring(str.length()-5));// son bes harfı verır
        System.out.println(str.substring(str.length()));//hıclık verır
    }
}
