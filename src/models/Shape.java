package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shape {
    private double perimeter = 0;

    ArrayList points = new ArrayList<Point>;


    double distances[] = new double[points.size()];


    public addPoint(Point) {
        points.add(Point);
    }

    public addLengths {
        for (int i = 0; i < points.size() - 1; i++) {
            distances[i] = points[i].distance(points[i + 1].getX, points[i + 1].getY);
        }
    }


    public double calculatePerimeter() {

        for (int i = 0; i < distances.size(); i++) {
            perimeter += distances[i];
        }
        return perimeter;
    }

    public double getAvgSide() {
        return perimeter / distances.size();
    }

    public double getLongestSide() {
        double maxSide = distances[0];
        for (int i = 1; i < distances.size(); i++) {
            if (distances[i] > maxSide) maxSide = distances[i];
        }
        return maxSide;
    }

    // container of Points (e.g. ArrayList<Point>)

    // addPoint(Point) - adds to the container

    // calculatePerimeter()

    // getAverageSide()

    // getLongestSide()
}
