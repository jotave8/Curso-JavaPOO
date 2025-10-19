package q3;

public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Retangle retangle = new Retangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        GeometryCalculator calculator = new GeometryCalculator();

        System.out.println("=== Area ===");
        System.out.println("Circle: " + calculator.calculateArea(circle.getRadius()));
        System.out.println("Retangle: " + calculator.calculateArea(retangle.getBase()));
        System.out.println("Triangle: " + calculator.calculateArea(triangle.getSide1(), triangle.getSide2(), triangle.getSide3()));

        System.out.println("\n=== Perimeter ===");
        System.out.println("Circle: " + calculator.calculatePerimeter(circle.getRadius()));
        System.out.println("Retangle: " + calculator.calculatePerimeter(retangle.getBase(), retangle.getHeight()));
        System.out.println("Triangle: " + calculator.calculatePerimeter(triangle.getSide1(), triangle.getSide2(), triangle.getSide3()));
    }
}