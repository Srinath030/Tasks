public class Palindrome {
    public static void main(String[] args) {
        String str="MOM";
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev=rev+str.charAt(i);
           
            }
            if (rev.equals(str)) {
                System.out.println("Given String is palindrom");
                }
            else{
                System.out.println("Given String is not a palindrom");
            }    
    }
}
