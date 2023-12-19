package GeekBrains.OOP.Seminar_6.OCP;

public class Bus extends Transport{
    public Bus(int maxspeed) {
        super(maxspeed, "Bus");
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxspeed*0.5;
    }
}
