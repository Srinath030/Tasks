public class Argumentchanging {
    public static int add(int a, int b){
        return a+b;
    }  
    public static double add(int a,int b,int c){
        return a+b+c;
    }  
}
    class Overloading{  
    public static void main(String[] args){  
    System.out.println(Argumentchanging.add(10,20));  
    System.out.println(Argumentchanging.add(40,20,40));  
    }
}
