package problem2;

/**
 * A demo class to test Point and MovablePoint.
 */
public class Demo {
    public static void main(String[] args) {
        // Create a basic Point
        Point p1 = new Point(2.5f, 3.0f);
        System.out.println("Initial Point: " + p1);

        // Create a MovablePoint
        MovablePoint mp = new MovablePoint(5.0f, 6.0f, 1.5f, 2.0f);
        System.out.println("Initial MovablePoint: " + mp);

        // Move the point
        mp.move();
        System.out.println("After moving: " + mp);
    }
}
