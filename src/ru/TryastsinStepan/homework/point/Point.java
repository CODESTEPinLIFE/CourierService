package ru.TryastsinStepan.homework.point;

public class Point {
    private double x;
    private double y;

    public Point() {}

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point[" +
                "x :" + x +
                ", y :" + y +
                ']';
    }
    public int distancePoint(Point z){
        return (int) Math.sqrt(Math.pow((z.x - getX()), 2) + Math.pow((z.y - getY()), 2));
    }
}
