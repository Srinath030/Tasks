import java.util.Arrays;

public class Mergearrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] prr={6,7,8,9,10};
        int arr1=arr.length;
        int prr1=prr.length;
        int result=arr1+prr1;

        int[] a=new int[result];
        System.arraycopy(arr, 0, a, 0, arr1);
        System.arraycopy(prr, 0, a, arr1, prr1);
        System.out.println(Arrays.toString(a));
    }
}
