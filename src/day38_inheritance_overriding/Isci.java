package day38_inheritance_overriding;

public class Isci  extends Personel{


   public String statu = "Isci";
   public String haklar = "Iscıle kıdem tazmınatı alırlar";
  public   String ikramiye="ıscıler yıl da bır ıkramıye alır";

    public void mesai() {
        System.out.println("Tum ıscilr haftalık 40 saat calısır");
    }

    public void maasHesapla() {

        System.out.println("Tum personel 30 gun * 8 saat * 10 euro=" + (30 * 8 * 10) + "Euro maas");
    }
}
