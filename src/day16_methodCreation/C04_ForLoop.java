package day16_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        //verılem strıng ı tersten yazdıran bır kod yazınız

        String str="Valla bu java cok zevklı";


        for (int i=str.length()-1;i >=0;i--){

            System.out.println(str.substring(i,i+1));
        }

    }
}
