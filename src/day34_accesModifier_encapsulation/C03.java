package day34_accesModifier_encapsulation;

public class C03 {

    private   int sayı;
    private String str;

    public int getSayı() {
        return sayı;
    }

    public void setSayı(int sayı) {
        this.sayı = sayı;
    }

    public String getStr(){
        return str;

    }

    @Override
    public String toString() {
        return "C03{" +
                "sayı=" + sayı +
                ", str='" + str + '\'' +
                '}';
    }


    public void setStr(String java_java_java) {
    }
}



