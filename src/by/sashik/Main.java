package by.sashik;

import by.sashik.entities.*;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Shapes shapes = new Shapes(new Shape[]{
                new Circle(1, 1, 10),
                new Ellipse(2, 4, 12, 7),
                new Square(3, 5, 5)
        });
        shapes.draw();
    }
}
