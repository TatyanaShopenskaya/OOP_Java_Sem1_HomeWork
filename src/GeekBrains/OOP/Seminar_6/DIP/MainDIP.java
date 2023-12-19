package GeekBrains.OOP.Seminar_6.DIP;

public class MainDIP {
    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
        car.start();
        Car car1 = new Car(new PetroleEngine());
        car1.start();
    }
}
