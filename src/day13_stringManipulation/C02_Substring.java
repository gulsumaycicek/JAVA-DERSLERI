package day13_stringManipulation;

public class C02_Substring {
    public static void main(String[] args) {

        String str="1-48 of 104 results fot \"nutella\"";
        int ilkSpace=str.indexOf("");
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);
        String aramaSonucSayısıStr=str.substring(ikinciSpace+1,ucuncuSpace);


        int aramaSonucSayısıınt=Integer.valueOf(aramaSonucSayısıStr);

        if (aramaSonucSayısıınt>100){
            System.out.println("Super");

        }else {
            System.out.println("az sonuc bulundu");
        }
    }
}
