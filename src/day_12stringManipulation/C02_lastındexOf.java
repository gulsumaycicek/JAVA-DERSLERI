package day_12stringManipulation;

public class C02_lastındexOf {
    public static void main(String[] args) {


        //  Kullanicidan bir cumle ve bir kelime isteyin,
        //  kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //  - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle = "Java ogren yenı program ıle yenı bır sayfa ac";
        String kelıme = "yenı";

        int ilkkullanım = cumle.indexOf(kelıme);

        int ikincikullanım = cumle.lastIndexOf(kelıme);

        if (ilkkullanım == (-1)) {

            System.out.println("kelıme kullamılmamıs");
        } else if (ikincikullanım == (-1)) {

            System.out.println("kelıme 1 defa kullanılmıstır");

        } else {
            System.out.println("kelime 1 den fazla kullanılmıstır");
        }

        String str = "Eclipse";


    }


}
