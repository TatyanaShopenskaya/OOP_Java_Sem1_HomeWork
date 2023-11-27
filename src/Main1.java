public class Main1 {   //класс
    public static void main(String[] args) {   //метод main
        Box box1 = new Box(10,10,10);   //создаем реальную коробку с пом шаблона Box
        //box1.setDinens(10,10,10);   //вызываем метод задания параметров
        //box1.height = 10;
        //box1.length = 10;       //присвоили значения параметров нашей коробки
        //box1.width = 10;


        box1.showVolume();   //вызываем готовый метод


        Box box2= new Box(10,10,2);   //создаем реальную вторую коробку с пом шаблона Box
        Box box3 = box2;       //теперь на один объект ссылается 2 переменных и box3 влияет на рез-т box2
        //box2.setDinens(20,20,5);
        //box2.height = 8;
        //box2.length = 10;       //присвоили значения параметров нашей коробки
        //box2.width = 10;
        //box3.width = 1;
        box2.showVolume();   //считаем объем нашей коробки

        Box box4 = new Box(5);
        box4.showVolume();

    }
}
