package GeekBrains.OOP.Seminar_1;

public class HotDrink extends Product{
    private double volume;  //добавили параметр, кот. нет в родит. классе
    private int temp;    //добавили параметр, кот. нет в родит. классе

    public HotDrink(String name, double cost, double volume, int temp) {   //задаем параметры из класса-родителя
        super(name, cost);
        this.volume = volume; //инициализировали
        this.temp = temp;     //инициализировали
    }

    public double getVolume() {

        return volume;
    }
    public int getTemp() {
        return temp;
    }

    public void setVolume (int volume){
        this.volume = volume;
    }

    public void setTemp (int temp){
        this.temp = temp;
    }

    @Override
    public String toString () {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +    // супер т.к. это идет о родит.класса
                ", cost=" + super.getCost() + '\'' +
                ", volume=" + volume + '\'' +
                ", temp=" + temp +
                '}';
    }
}


