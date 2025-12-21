package models;
//perimeter


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shape {

    private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        if(points.size()<2) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i< points.size() - 1;i++ ){
            sum += points.get(i).distance(points.get(i + 1));
        }
        sum += points.get(points.size() - 1).distance(points.get(0));
        return sum;
    }

    public double getAverageSide() {
        if (points.size()<2){
            return 0;
        }
        return calculatePerimeter() / points.size();
    }

    public double getLongest() {
        if (points.size()<2){
            return 0;
        }
        double max = 0;

        for(int i=0; i < points.size() - 1;i++){
            double dist = points.get(i).distance(points.get(i + 1));
            if(dist > max){
                max = dist;
            }
        }
        double lastDist = points.get(points.size() - 1).distance(points.get(0));
        if (lastDist > max){
            max = lastDist;
        }

        return max;
    }
    // container of Points (e.g. ArrayList<Point>)

    // addPoint(Point) - adds to the container

    // calculatePerimeter()

    // getAverageSide()

    // getLongestSide()
}