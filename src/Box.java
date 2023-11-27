public class Box {   //класс box с полями длина, ширина, высота
    //метода здесь нет, т.е. мы создали просто шаблон коробки
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {    //создаем конструктор Бокс, в котором будет делать действия
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this.length = size;
        this.height = size;
        this.width = size;
    }

    public void setDinens(double length, double width, double height) {            //создаем невозвращаемый метод для задания размеров коробки
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box copy() {              //метод, который создаем копию существующей коробк
        return new Box(this.length, this.width, this.height);
    }

    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

//    void compare (Box another) {           ///метод для сравнения 2х коробок
//        double currentVolume = getVolume();
//        double anotherVolume = another.getVolume();
//        if (currentVolume > anotherVolume) {
//            System.out.println("current Box > another Box");
//        } else if (currentVolume < anotherVolume) {
//            System.out.println("current Box < another Box");
//        } else {
//            System.out.println("коробки равны");
//        }
//    }

    public int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    double getVolume() {      //создаем метод для вычисления объема внутри класса бокс
        double volume = length * width * height;
        return volume;   //возвращаем значение метода
        //можно сразу написать "return length*width*height";
    }

    public double showVolume() {     //метод вывода объема в консоль
        double volume = length * width * height;
        System.out.println(volume);
        return volume;


        //можно записать  так через Войд (если нам не надо сохранять данные, а только вернуть):
        //void showVolume() {     //метод вывода объема в консоль
        //System.out.println(getVolume);
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void showInfo() {     //метод вывода объема в консоль
        double volume = length * width * height;
        System.out.println(getLength() + ", " + getHeight() + ", " + getWidth());
    }
}
