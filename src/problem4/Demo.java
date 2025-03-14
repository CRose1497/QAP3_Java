package problem4;

/**
 * A demo class to test the Shape hierarchy with scaling.
 */
public class Demo {
    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = new Shape[] {
            new Circle(5),
            new Ellipse(7, 5),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(6)
        };

        // Print original shapes
        System.out.println("Original Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by 2
        System.out.println("\nAfter Scaling by a factor of 2:");
        for (Shape shape : shapes) {
            shape.scale(2);
            System.out.println(shape);
        }
    }
}
