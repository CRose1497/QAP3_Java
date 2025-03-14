package problem3;

/**
 * A demo class to test the Shape hierarchy.
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

        // Loop through each shape and print details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
