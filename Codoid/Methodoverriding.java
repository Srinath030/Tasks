// If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.


public class Methodoverriding {
    public void run() {
        System.out.println("He is Running");
    }
}
 class Bike extends Methodoverriding{
    public void run() {
        System.out.println("Usain bolt is gretest runner in world");    
    }
public static void main(String[] args) {
    Bike obj=new Bike();
    obj.run();
}
}
