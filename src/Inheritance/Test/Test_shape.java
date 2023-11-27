package Inheritance.Test;

import Inheritance.Rectangle;
import Inheritance.Shape;
import Inheritance.Triangle;

public class Test_shape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2,5);
        Triangle triangle = new Triangle(4,5,8);
        rect.showPerimeter();
        triangle.showPerimeter();

    }
}
