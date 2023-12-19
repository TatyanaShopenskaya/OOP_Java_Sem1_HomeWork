package GeekBrains.OOP.Seminar_6;

import GeekBrains.OOP.Seminar_6.OCP.Bus;
import GeekBrains.OOP.Seminar_6.OCP.Car;
import GeekBrains.OOP.Seminar_6.OCP.Transport;

public class MainOCP {
    public static void main(String[] args) {
        Transport transport = new Transport(100,"Велосипед");
        System.out.println(transport);
        transport = new Car(70);
        System.out.println(transport+String.valueOf(transport.calculateAllowedSpeed()));
        transport = new Bus(50);
        System.out.println(transport+String.valueOf(transport.calculateAllowedSpeed()));
//    Car car = new Car(70);
//    Bus bus = new Bus(50);
//        System.out.println(car.calculateAllowedSpeed());
//        System.out.println(bus.calculateAllowedSpeed());
    }
}
