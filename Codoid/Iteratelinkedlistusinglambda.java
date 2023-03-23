import java.util.LinkedList;

public class Iteratelinkedlistusinglambda {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(32);
        list.add(98);
        list.add(76);
        list.add(98);

        list.forEach(a -> System.out.println(a));
        
    }
}
