public abstract class Abstractexample {
   abstract void draw();
     }
     
     class Circle extends Abstractexample {
        void draw() {
           System.out.println("Drawing Circle");
        }
     }
     
     class Rectangle extends Abstractexample {
        void draw() {
           System.out.println("Drawing Rectangle");
        }
     }
     
      class AbstractionDemo {
        public static void main(String args[]) {
           Abstractexample s = new Circle();
           s.draw();
           
           s = new Rectangle();
           s.draw();
        }
     }
     

