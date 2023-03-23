import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Duplicatearraylist {
     public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(2);
                list.add(3);
                list.add(2);
                list.add(4);
                list.add(3);
        
         Set<Integer> duplicates = new HashSet<>();
         Set<Integer> uniques = new HashSet<>();
                 for (Integer number : list) {
                    if (!uniques.add(number)) {
                        duplicates.add(number);
                 }
                }
                System.out.println(duplicates);  
                }
 }

