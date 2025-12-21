
//distance
package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
    }

    // constructor having both parameters

    public void setX(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest) {
        double dx = this.x-dest.x;
        double dy = this.y-dest.y;
        return Math.hypot(dx, dy);
    }
    // toString
}