package models;
import java.lang.Math;

public class Point {

    private double x;
    private double y;

    public double distance(double x, double y) {  // Returns the distances from the provided points to the initial points
        double testx = Math.pow(x - this.x, 2);
        double testy = Math.pow(y - this.y, 2);
        return Math.sqrt(testx + testy);
    }

    public double getX() {  // This method returns the x-coordinate value
        return x;
    };
    public double getY() {  // This method returns the y-coordinate value
        return y;
    }

    public Point(double x, double y) {  // This constructor lets you create a point with given coordinates
        this.x = x;
        this.y = y;
    }



    @Override
    public String toString() {
        return "Point { x=" + x + ", y=" + y + '}';
    }
}
