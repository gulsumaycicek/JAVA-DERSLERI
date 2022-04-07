package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str="Java gun gectıkce guzellesıyor";

        String kelımeler[]=str.split(" ");

        System.out.println(Arrays.toString(kelımeler));//[Java, gun, gectıkce, guzellesıyor]

        String gectıkce[]=str.split("gectıkce");
        System.out.println(Arrays.toString(gectıkce));//Java gun ,  guzellesıyor]

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));//J, a, v, a,  , g, u, n,  , g, e, c, t, ı, k, c, e,  , g, u, z, e, l, l, e, s, ı, y, o, r]

    }
}
