package by.sashik;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Shapes {
    private List<Shape> shapesList;

    public Shapes(Shape[] shapesList) {
        this.shapesList = Arrays.asList(shapesList);
    }

    public List<Shape> getShapes() {
        return shapesList;
    }

    public void addShape(Shape shape) {
        shapesList.add(shape);
    }

    public void draw() {
        for (Shape shape : shapesList) {
            System.out.println(shape);
        }
    }
}
