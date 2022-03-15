package by.sashik.entities;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ellipse extends Ellipse2D {
    private Point point;
    private double height;
    private double width;

    public Ellipse(double x, double y, double height, double width) {
        this.point = new Point(x, y);
        this.width = width;
        this.height = height;
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

    @Override
    public void setFrame(double x, double y, double w, double h) {
        this.point.setLocation(x, y);
        this.width = w;
        this.height = h;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    public String toString() {
        return "Ellipse = (point = " + point + ", width = " + width + ", height = " + height + ")";
    }
}
