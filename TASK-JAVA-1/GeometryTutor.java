/*4) Geometry Tutor (OOP) 
Question: An education platform needs a geometry tutor that calculates areas for multiple 
shapes uniformly. Develop a Java program that: 
1. Defines a base Shape class with a getArea() method returning 0 by default. 
2. Creates Circle and Rectangle subclasses, each overriding getArea(). 
3. In main(), holds these shapes in a collection and calls getArea() on each to 
demonstrate polymorphism. 
 */




import java.util.*;

public class GeometryTutor {

    static abstract class Shape {
        public abstract double getArea();
    }

    static class Circle extends Shape {
        private double r;

        public Circle(double r) {
            this.r = r;
        }

        @Override
        public double getArea() {
            return Math.PI * r * r;
        }
    }

    static class Rectangle extends Shape {
        private double l;
        private double b;

        public Rectangle(double l, double b) {
            this.l = l;
            this.b = b;
        }

        @Override
        public double getArea() {
            return l * b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.println("Enter the number of shapes:");
        int n = sc.nextInt();
        sc.nextLine(); // Clear the buffer

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the shape type (Circle or Rectangle):");
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("Circle")) 
            {
                System.out.println("Enter the radius of the circle:");
                if (sc.hasNextDouble()) 
                {
                    double r = sc.nextDouble();
                    shapes.add(new Circle(r));
                    sc.nextLine(); // Clear the buffer
                } else 
                {
                    System.out.println("Invalid input for radius. Skipping this shape.");
                    sc.nextLine(); // Clear the buffer
                }
            } 
            else if (str.equalsIgnoreCase("Rectangle")) 
            {
                System.out.println("Enter the length and breadth of the rectangle:");
                if (sc.hasNextDouble()) 
                {
                    double l = sc.nextDouble();
                    if (sc.hasNextDouble()) 
                    {
                        double b = sc.nextDouble();
                        shapes.add(new Rectangle(l, b));
                        sc.nextLine(); // Clear the buffer
                    } 
                    else 
                    {
                        System.out.println("Invalid input for breadth. Skipping this shape.");
                        sc.nextLine(); // Clear the buffer
                    }
                } 
                else 
                {
                    System.out.println("Invalid input for length. Skipping this shape.");
                    sc.nextLine(); // Clear the buffer
                }
            } 
            else 
            {
                System.out.println("Invalid shape type. Skipping this shape.");
            }
        }

        // Calculate and print the areas of all shapes
        System.out.println("Areas of the shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

        sc.close();
    }
}