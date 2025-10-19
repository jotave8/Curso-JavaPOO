package q3;

public class GeometryCalculator {
    private int precision;

    public GeometryCalculator() {
        this.precision = 2; 
    }

    public GeometryCalculator(int precision) {
        this.precision = precision;
    }

    public GeometryCalculator(boolean useDefault) {
        this(3); 
    }

    private double round(double value) {
        double factor = Math.pow(10, precision);
        return Math.round(value * factor) / factor;
    }

    public double calculateArea(double radius) {
        return round(Math.PI * radius * radius);
    }

    public double calculateArea(double base, double height) {
        return round(base * height);
    }

    public double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return round(area);
    }

    public double calculatePerimeter(double... sides) {
        double sum = 0;
        for (double side : sides) {
            sum += side;
        }
        return round(sum);
    }
}
