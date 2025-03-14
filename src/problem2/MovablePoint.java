package problem2;

/**
 * A point that can move in 2D space.
 */
public class MovablePoint extends Point {
    private float xSpeed; // Speed along the X-axis
    private float ySpeed; // Speed along the Y-axis

    /**
     * Default constructor initializes everything to 0.
     */
    public MovablePoint() {
        super(); // Calls the default constructor of Point
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    /**
     * Constructor that initializes the position and speed.
     * @param x - Initial X coordinate
     * @param y - Initial Y coordinate
     * @param xSpeed - Speed along X-axis
     * @param ySpeed - Speed along Y-axis
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Calls the constructor of Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters and Setters
    public float getXSpeed() { return xSpeed; }
    public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }

    public float getYSpeed() { return ySpeed; }
    public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }

    /**
     * Moves the point by adding speed to the coordinates.
     */
    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    /**
     * Returns a string representation of the MovablePoint.
     */
    @Override
    public String toString() {
        return super.toString() + " Speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
