package week6;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        Circle circle = new Circle(radius);
        System.out.printf("Radius    = %.3f\n", circle.getRadius());
        System.out.printf("Perimeter = %.3f\n", circle.perimeter());
        System.out.printf("Area      = %.3f\n", circle.area());

        scanner.close();
    }
}