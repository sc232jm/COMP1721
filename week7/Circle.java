package week7;

public class Circle {
    private double radius;

    public Circle() {
        this(1.00);
    }

    public Circle(Double radius) {
        if(radius < 0) throw new IllegalArgumentException("Invalid Radius");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double perimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.4f)", this.radius);
    }

    @Override
    public boolean equals(Object obj) {
        Circle circle = (Circle) obj;
        return Math.abs(this.radius - circle.radius) < 0.00005;
    }
}
