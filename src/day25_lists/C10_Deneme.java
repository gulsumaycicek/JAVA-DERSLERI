package day25_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_Deneme {
    public static void main(String[] args) {

        List<String>harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler);
        harfler.add(1,"L");
        System.out.println(harfler);

        harfler.set(2,"D");
        System.out.println(harfler);

        harfler.remove(4);
        System.out.println(harfler);

        String arr[]={"A","L","C","D","B"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(harfler.contains("L"));

        harfler.clear();
        System.out.println(harfler);

        harfler.isEmpty();
        System.out.println(harfler);





    }
}
