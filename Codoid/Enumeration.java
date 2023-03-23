public class Enumeration {
    enum Compassdirection {
      North,
      South,
      East,
      West
    }
    public static void main(String[] args) {
        for (Compassdirection day : Compassdirection.values()) {
            System.out.println(day);
        }
    }
}
