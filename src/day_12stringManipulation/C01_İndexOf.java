package day_12stringManipulation;

public class C01_İndexOf {
    public static void main(String[] args) {

      //  Kullanicidan bir cumle ve bir kelime isteyin,
        //  kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
      //  - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //- Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle ="Java ogren yenı program ıle yenı bır sayfa ac";
      String kelıme="yenı";

      int ilkkullanım=cumle.indexOf(kelıme);

      int ikincikullanım=cumle.indexOf(kelıme,ilkkullanım+1);

      if (ilkkullanım==(-1)){
          System.out.println("girilrn kelime cumlede kullanılmamıs");

      }else if (ikincikullanım==(-1)){
          System.out.println("gırılen kelıme cumlede bır defa kullanılmıs");

      }else;{
            System.out.println("gırılen kelıme 1 den fazla kullanılmıstır");
        }

    }
}
