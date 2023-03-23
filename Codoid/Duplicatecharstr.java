public class Duplicatecharstr {
    public static void main(String[] args) {
        String s="career";
        int count=0;
       char[] a=s.toCharArray();
       for (int i = 0; i < s.length(); i++) {
        for (int j = i+1; j < s.length(); j++) {
            if(a[i]==a[j]){
                count++;
                System.out.print(a[j]);
         }
        }
       }
    }
}
