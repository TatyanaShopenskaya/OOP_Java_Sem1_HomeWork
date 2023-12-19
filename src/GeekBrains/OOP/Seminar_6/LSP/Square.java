package GeekBrains.OOP.Seminar_6.LSP;

public class Square extends QuadRangle{
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int area() {
        return a*a;
    }
}
