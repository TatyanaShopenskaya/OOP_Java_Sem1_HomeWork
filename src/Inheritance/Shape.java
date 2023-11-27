package Inheritance;

public abstract class Shape {
    private int a;
    private int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public final int getA(){  //final - чтобы запретить перераспределение метода
        return a;
    }

    public final int getB(){
        return b;
    }

    public abstract int getPerimeter();

    public void showPerimeter(){
        System.out.println(getPerimeter());
    }
}


