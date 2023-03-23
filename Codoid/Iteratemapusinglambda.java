import java.util.HashMap;
import java.util.Map;

public class Iteratemapusinglambda {

    public static void main(String[] args) {
        Map<Integer,String> a= new HashMap<>();
        a.put(1, "India");
        a.put(2, "Australia");
        a.put(3, "England");
        a.put(4, "UK");
        
        a.values().forEach(values -> System.out.println(values));
    }
}