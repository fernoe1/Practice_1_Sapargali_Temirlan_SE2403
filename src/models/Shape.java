package models;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> points = new ArrayList<Point>();
    public void addPoint(Point point) {
        points.add(point);
    }

    public double perimeter() {
        if (points.size() < 2) {

            return 0;
        }

        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            perimeter += points.get(i).distance(points.get((i+1) % points.size()));
        }

        return perimeter;
    }

    public double averageSide() {
        if (points.size() < 2) {

            return 0;
        }

        return perimeter() / points.size();
    }

    public double longestSide() {
        if (points.size() < 2) {

            return 0;
        }

        double longestSide = 0;
        for (int i = 0; i < points.size(); i++) {
            double tempSide = points.get(i).distance(points.get((i+1) % points.size()));
            if (longestSide < tempSide) {
                longestSide = tempSide;
            }
        }

        return longestSide;
    }
}
