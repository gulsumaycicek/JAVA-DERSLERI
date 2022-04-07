package day25_lists;

import java.sql.Array;
import java.util.Arrays;

public class C11_Deneme {
    public static void main(String[] args) {



        int [][]arr={ {1,2,3}, {4,5}, {6,7} };
        int sum=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                switch(i) {
                    case(0):
                        sum+=arr[i][j];
                        break;
                    case 1:
                        sum1+=arr[i][j];
                        break;
                    case 2:
                        sum2+=arr[i][j];
                        break;
                }
            }
        }
        int [] arrNew= {sum,sum1,sum2};
        System.out.println(Arrays.toString(arrNew));
    }
}
