package models;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Map;

public class Shape {

    private ArrayList<Point> points = new ArrayList<Point>();

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {  // This method adds a point to the points array.
        points.add(point);
    }

    public double calculatePerimeter() {  // This method returns the sum of all lengths
        double perimeter = 0;
        int len = points.size();
        for (int i = 0; i < len - 1; i++) {
            perimeter += points.get(i).distance(points.get(i+1));
        }
        perimeter += points.get(len - 1).distance(points.getFirst());
        return perimeter;
    }

    public double getAvgSide() {
        return calculatePerimeter() / points.size();
    }  //  This method returns the average side of the polygon

    public double getLongestSide() {  // This method returns the longest side of the polygon
        int len = points.size();
        double maxSide = points.get(len - 1).distance(points.getFirst());
        for (int i = 0; i < len - 1; i++) {
            double distance = points.get(i).distance(points.get(i+1));
            if (distance > maxSide) maxSide = distance;
        }
        return maxSide;
    }
}
