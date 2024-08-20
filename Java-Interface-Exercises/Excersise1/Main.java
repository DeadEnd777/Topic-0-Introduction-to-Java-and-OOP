//Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(4, 8);
        Circle circle = new Circle(6);

        System.err.println("------Rectangle Area------");
        System.err.println(rectangle.getArea());
        
        System.err.println("------Triangle Area------");
        System.err.println(triangle.getArea());
        
        System.err.println("------Circle Area------");
        System.err.println(circle.getArea());
    }
}
