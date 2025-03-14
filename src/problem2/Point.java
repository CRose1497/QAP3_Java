package problem2;

/**
 * Represents a point in 2D space.
 */
public class Point {
    private float x; // X coordinate
    private float y; // Y coordinate

    /**
     * Default constructor that sets x and y to 0.
     */
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    /**
     * Constructor that sets x and y to specified values.
     * @param x - X coordinate
     * @param y - Y coordinate
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public float getX() { return x; }
    public float getY() { return y; }

    // Setter methods
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }

    /**
     * Returns a string representation of the point.
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
