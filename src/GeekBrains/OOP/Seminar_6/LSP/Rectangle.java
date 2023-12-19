package GeekBrains.OOP.Seminar_6.LSP;

public class Rectangle extends QuadRangle{
    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return width*height;
    }
}
