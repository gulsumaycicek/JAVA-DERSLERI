package day_12stringManipulation;

public class C05_Replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendık";

        System.out.println(str.replace(" ","").length());


        System.out.println(str.length());

        str=str.replace("Bugun","yarın");

        str=str.replace("ogrendık","ogrenecegız");
        System.out.println(str);

    }
}
