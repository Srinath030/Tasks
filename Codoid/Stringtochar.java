public class Stringtochar {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] charArray = str.toCharArray();

        char c='A';
        String s=Character.toString(c);

        System.out.println(charArray);
        System.out.println(c);

    }
}
