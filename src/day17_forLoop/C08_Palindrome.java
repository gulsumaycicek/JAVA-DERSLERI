package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir
        //methot olusturun



        String input="ada";
        palintromKontrolEt(input);


    }

    private static void palintromKontrolEt(String input) {

        String terstenInput="";

        for (int i =input.length()-1; i >=0 ; i--) {
            terstenInput+=input.charAt(i);


        }
        System.out.println("gırdıgınız kelımenın tersten yazılısı:"+terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){

            System.out.println("gırdıgınız kelıme palintrome");

        }else {

            System.out.println("gırdıgınız kelıme palintrome degıl");
        }
    }
}
