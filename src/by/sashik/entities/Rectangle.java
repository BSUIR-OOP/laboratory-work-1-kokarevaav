package by.sashik.entities;

import java.awt.geom.Rectangle2D;

public class Rectangle extends Rectangle2D {
    private Point point;
    private double height;
    private double width;

    public Rectangle(double x, double y, double height, double width) {
        this.point = new Point(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void setRect(double x, double y, double w, double h) {
        this.point.setLocation(x, y);
        this.width = w;
        this.height = h;
    }

    @Override
    public int outcode(double x, double y) {
        return 0;
    }

    @Override
    public Rectangle2D createIntersection(Rectangle2D r) {
        return null;
    }

    @Override
    public Rectangle2D createUnion(Rectangle2D r) {
        return null;
    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        return "Rectangle = (point = " + point + ", width = " + width + ", height = " + height + ")";
    }
}
