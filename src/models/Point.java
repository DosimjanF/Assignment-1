package models;
import java.lang.Math;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {  // This constructor lets you create a point with given coordinates
        setX(x);
        setY(y);
    }

    public double distance(Point point) {  // Returns the distances from the provided points to the initial points
        double xlen = Math.pow(point.getX() - this.x, 2);
        double ylen = Math.pow(point.getY() - this.y, 2);
        return Math.sqrt(xlen + ylen);
    }

    public double getX() {  // This method returns the x-coordinate value
        return x;
    }
    public double getY() {  // This method returns the y-coordinate value
        return y;
    }

    public void setX(double x) {  // This method is a setter for x-coordinate value
        this.x = x;
    }

    public void setY(double y) {  // This method is a setter for y-coordinate value
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point { x=" + x + ", y=" + y + '}';
    }
}
