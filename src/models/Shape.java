package models;

import java.util.ArrayList;

public class Shape {
    private double perimeter = 0;

    private ArrayList<Point> points = new ArrayList<Point>();

    private ArrayList<Double> distances = new ArrayList<Double>();

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {  // This method adds a point to the points array.
        points.add(point);
    }

    public void addLengths() {  // This method adds the distances between each point to the array (The lengths of the polygon)
        int len = points.size();
        for (int i = 0; i < len - 1; i++) {
            distances.add(points.get(i).distance(points.get(i+1).getX(), points.get(i+1).getY()));
        }
        distances.add(points.get(len - 1).distance(points.getFirst().getX(), points.getFirst().getY()));
    }


    public double calculatePerimeter() {  // This method returns the sum of all lengths

        for (int i = 0; i < distances.size(); i++) {
            perimeter += distances.get(i);
        }
        return perimeter;
    }

    public double getAvgSide() {
        return perimeter / distances.size();
    }  //  This method returns the average side of the polygon

    public double getLongestSide() {  // This method returns the longest side of the polygon
        double maxSide = distances.get(0);
        for (int i = 1; i < distances.size(); i++) {
            if (distances.get(i) > maxSide) maxSide = distances.get(i);
        }
        return maxSide;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public ArrayList<Double> getDistances() {
        return distances;
    }

}
