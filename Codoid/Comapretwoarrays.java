import java.util.ArrayList;

public class Comapretwoarrays {
    public static void main(String[] args) {
        int[] a={1,2,4,7,3};
        int[] b={2,5,9,8,6};

        ArrayList<Integer> commonele=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
            if (a[i]== b[j]) {
                commonele.add(a[i]);
                break;
            }
        }
    }
        System.out.println("Common element is " + commonele);
    }
}
