package problem4;

/**
 * Abstract class representing a geometric shape.
 */
public abstract class Shape implements Scalable {
    protected String name; // Name of the shape

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
