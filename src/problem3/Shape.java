package problem3;

/**
 * Abstract class representing a geometric shape.
 */
public abstract class Shape {
    protected String name; // Name of the shape

    /**
     * Constructor for Shape.
     * @param name - Name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods to be implemented in subclasses
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
