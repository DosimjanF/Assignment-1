package models;
import java.lang.Math;

public class Point {

    private double x;
    private double y;

    public double distance(double x, double y) {
        double testx = Math.pow(x - this.x, 2);
        double testy = Math.pow(y - this.y, 2);
        return Math.sqrt(testx + testy);
    }

    public double getX() {
        return x;
    };
    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public String toString() {
        return "Point { x=" + x + ", y=" + y + '}';
    }
}
