
public class Datatypesoverloading {
     
        public static int add(int a, int b){
            return a+b;
        }  
        public static double add(double a, double b){
            return a+b;
        }  
        }  
        class Overloading2{  
        public static void main(String[] args){  
        System.out.println(Datatypesoverloading.add(10,20));  
        System.out.println(Datatypesoverloading.add(1.5,2.5));  
        }
     }

    
