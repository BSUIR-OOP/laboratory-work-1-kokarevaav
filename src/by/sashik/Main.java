package by.sashik;

import by.sashik.entities.*;
import by.sashik.entities.Rectangle;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Shapes shapes = new Shapes(new Shape[]{
                new Rectangle(1, 1, 10, 10),
                new Circle(1, 1, 1),
                new Ellipse(2,2,2,2),
                new Line(1,1,1,1),
                new Square(1,1,1)


        });
        shapes.draw();
    }
}
