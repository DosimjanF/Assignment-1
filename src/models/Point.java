package models;
import java.lang.Math;

public class Point {
    private double x;
    private double y;
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public getX() {
        return x
    }
    public getY() {
        return y
    }

    public Point(double x, double y) {
        setX(x)
        setY(x)
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow((x - getX(), 2)) +  Math.pow((y - getY(), 2)))
    }

    @Override
    public String toString() {
        return "Point { x=" + x + ", y=" + y + '}';
    }
}
