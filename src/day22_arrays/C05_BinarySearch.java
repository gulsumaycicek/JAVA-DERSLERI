package day22_arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        int istenenSayı=1;

        istenenElemanVarmı(arr,istenenSayı);
    }

    private static void istenenElemanVarmı(int[] arr, int istenenSayı) {

        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenenSayı){
                sonuc=true;
                break;
            }
        }
        System.out.println(sonuc);


    }
}
