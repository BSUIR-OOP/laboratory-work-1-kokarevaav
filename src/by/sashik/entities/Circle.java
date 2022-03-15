package by.sashik.entities;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Ellipse2D {
    private Point point;
    private double diameter;

    public Circle(double x, double y, double diameter) {
        this.point = new Point(x, y);
        this.diameter = diameter;
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
        return diameter;
    }

    @Override
    public double getHeight() {
        return diameter;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    @Deprecated
    public void setFrame(double x, double y, double w, double h) {

    }

    public void setFrame(double x, double y, double d) {
        this.point.setLocation(x, y);
        this.diameter = d;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    public String toString() {
        return "Square = (point = " + point + ", diameter = " + diameter + ")";
    }
}
