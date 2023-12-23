package models;

import java.util.ArrayList;

public class Shape {
    private double perimeter = 0;

    private ArrayList<Point> points = new ArrayList<Point>();

    private ArrayList<Double> distances = new ArrayList<Double>();

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public void addLengths() {
        for (int i = 0; i < points.size() - 1; i++) {
            distances.add(points.get(i).distance(points.get(i+1).getX(), points.get(i+1).getY()));
        }
    }


    public double calculatePerimeter() {

        for (int i = 0; i < distances.size(); i++) {
            perimeter += distances.get(i);
        }
        return perimeter;
    }

    public double getAvgSide() {
        return perimeter / distances.size();
    }

    public double getLongestSide() {
        double maxSide = distances.get(0);
        for (int i = 1; i < distances.size(); i++) {
            if (distances.get(i) > maxSide) maxSide = distances.get(i);
        }
        return maxSide;
    }

    // container of Points (e.g. ArrayList<Point>)

    // addPoint(Point) - adds to the container

    // calculatePerimeter()

    // getAverageSide()

    // getLongestSide()
}
