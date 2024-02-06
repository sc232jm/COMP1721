package week7;

public class CircleDemo {
    public static void main(String[] args) {
        double radius = -1.0;
        if(args.length > 0) radius = Double.parseDouble(args[0]);

        Circle circle = radius != -1 ? new Circle(radius) : new Circle();
        Circle circle2 = new Circle(3.00);

        System.out.println(circle.toString());
        System.out.printf("Perimeter = %.3f\n", circle.perimeter());
        System.out.printf("Area      = %.3f\n", circle.area());
        System.out.println(circle.equals(circle2));
    }
}