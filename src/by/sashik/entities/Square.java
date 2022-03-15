package by.sashik.entities;

import java.awt.geom.Rectangle2D;

public class Square extends Rectangle2D {

    private Point point;
    private double width;

    public Square(double x, double y, double width) {
        this.point = new Point(x, y);
        this.width = width;
    }

    @Override
    @Deprecated
    public void setRect(double x, double y, double w, double h) {
    }

    public void setRect(double x, double y, double w){
        this.point.setLocation(x, y);
        this.width = w;
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
        return this.width;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        return "Square = (point = " + point + ", width = " + width + ")";
    }
}
