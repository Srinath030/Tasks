public class Functions implements Multipleinterface,Interface1 {
    public void age() {
        System.out.println("I am 22");
    }
    public void College() {
        System.out.println("Studied at SRM");
    }
    public static void main(String[] args) {
        Functions a=new Functions();
        a.age();
        a.College();
    }
}
