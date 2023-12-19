package GeekBrains.OOP.Seminar_6.Main;

import GeekBrains.OOP.Seminar_6.LSP.QuadRangle;
import GeekBrains.OOP.Seminar_6.LSP.Rectangle;
import GeekBrains.OOP.Seminar_6.LSP.Square;

public class LSP {
    public static void main(String[] args) {
        QuadRangle quadRangle = new Rectangle(5,5);
            quadRangle = new Square(5);
    }
}
