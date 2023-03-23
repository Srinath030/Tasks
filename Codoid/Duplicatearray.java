import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class Duplicatearray {
    
        public static void main(String[] args) {
            // declare an array
             int[] age = new int[5];
             age[0]=10;
             age[1]=400;
             age[2]=20;
             age[3]=20;
             age[4]=30;

             Set<Integer> s = new LinkedHashSet<Integer>();
             for(int i=0;i<age.length;i++){  
                s.add(age[i]);  
             }
             for (Integer arrr : s) {
                System.out.println(arrr);
                
             }
        }

        }    

