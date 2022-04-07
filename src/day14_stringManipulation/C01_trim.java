package day14_stringManipulation;

public class C01_trim {

    public static void main(String[] args) {

        String str="  Siz ne dersenız degın java bıldıgını okur  ";

        str.trim();
        System.out.println(str);//bosluklarıda yazdırır
        System.out.println(str.length());
       str= str.trim();
        System.out.println(str);//boslukları yazdırmaz sıler
        System.out.println(str.length());







    }
}
