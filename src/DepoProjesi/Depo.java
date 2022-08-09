package DepoProjesi;

public class Depo {

    private int miktar;
    private String isim;
    private String uretici;
    private String birimi;
    private int raf;

    Depo() {
    }


    public Depo(String isim, String uretici, int miktar, String birimi, int raf) {
        this.miktar = miktar;
        this.isim = isim;
        this.uretici = uretici;
        this.birimi = birimi;
        this.raf = raf;
    }


    public int getMiktar() {
        return miktar;
    }


    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }


    public String getIsim() {
        return isim;
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }


    public String getUretici() {
        return uretici;
    }


    public void setUretici(String uretici) {
        this.uretici = uretici;
    }


    public String getBirimi() {
        return birimi;
    }


    public void setBirimi(String birimi) {
        this.birimi = birimi;
    }


    public int getRaf() {
        return raf;
    }


    public void setRaf(int raf) {
        this.raf = raf;
    }


    @Override
    public String toString() {
        return "Ürün Listesi : " +
                "ismi : " + isim + '\'' +
                ", üreticisi : " + uretici + '\'' +
                ", birimi : " + birimi + '\'';
    }
}
