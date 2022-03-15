package by.sashik;

import by.sashik.entities.*;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Shapes shapes = new Shapes(new Shape[]{
                new Circle(1, 1, 10),
                new Square(3, 5, 5),
                new Ellipse(4, 5, 10, 2)
        });
        shapes.draw();
    }
}
