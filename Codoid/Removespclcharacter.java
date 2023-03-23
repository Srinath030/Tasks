
 
public class Removespclcharacter {
public static void main(String[] args) {
    String S="My name ^%%$^%is Cristiano^%&$ ronaldo";
    S=S.replaceAll("\\W", " ");
    System.out.println(S);
}
    
}