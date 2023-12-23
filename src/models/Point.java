package models;
import java.lang.Math;

public class Point {

    private double x;
    private double y;

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((x - getX()), 2)) +  Math.pow((y - getY()), 2);
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
