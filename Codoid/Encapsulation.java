public class Encapsulation {
    private String name;
    private int age;
 
    public String getName() {
         return name;
         }
 
    public void setName(String name) { 
        this.name = name;
     }
 
    public int getAge() { 
        return age;
     }
 
    public void setAge(int age) { 
        this.age = age;
     }
}
 
 class Main {
    public static void main(String[] args)
    {
       Encapsulation person = new Encapsulation();
        person.setName("John");
        person.setAge(30);
 
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
