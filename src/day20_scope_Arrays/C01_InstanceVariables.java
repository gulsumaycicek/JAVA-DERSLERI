package day20_scope_Arrays;

public class C01_InstanceVariables {


    int sayı;
    String bransİsmı="Java";
    boolean okuldaMı;


    public static void main(String[] args) {

        // sayi=10;  sayi variable'i static olmadigi icin main method'dan direk kullanilamaz
        // instance variable'lara static method'lardan ulasabilmek icin obje olusturmamiz gerekir
        

        C01_InstanceVariables obj1=new C01_InstanceVariables();
        System.out.println(obj1.sayı);//0
        obj1.sayı=10;
        System.out.println(obj1.sayı);//10
        obj1.bransİsmı="SOL";
        System.out.println(obj1.okuldaMı);//false

        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayı);//0
        System.out.println(obj2.bransİsmı);//java

        obj1.okuldaMı=true;
        System.out.println(obj2.okuldaMı);//false








    }
}
