package GeekBrains.OOP.Seminar_6.OCP;

public class Car extends Transport{
    public Car(int maxspeed) {
        super(maxspeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxspeed*0.8;
    }
}
