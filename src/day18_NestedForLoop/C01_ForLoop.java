package day18_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

      // Kullanicidan 10’dan kucuk bir  tamsayi isteyin
       // ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)
        
        
        
        int input=9;
        int faktoryel=1;
        String faktoryelAcıkYazım="";


        for (int i =input; i >=1 ; i--) {
            faktoryel*=i;

            if (i==input){
              faktoryelAcıkYazım=faktoryelAcıkYazım  +i;


            }else {

                faktoryelAcıkYazım=faktoryelAcıkYazım+"*"+i;
            }
            faktoryelAcıkYazım=faktoryelAcıkYazım+i+"*";

            
        }

        System.out.println(input+"!="+faktoryelAcıkYazım+" ="+faktoryel);
        
        
        
    }
}
