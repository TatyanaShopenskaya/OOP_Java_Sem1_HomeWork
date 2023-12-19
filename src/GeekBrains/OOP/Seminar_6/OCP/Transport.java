package GeekBrains.OOP.Seminar_6.OCP;

public class Transport {
    int maxspeed;
    String type;

    public Transport(int maxspeed, String type) {
        this.maxspeed = maxspeed;
        this.type = type;
    }

    public double calculateAllowedSpeed(){
        return maxspeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "maxspeed=" + maxspeed +
                ", type='" + type + '\'' +
                '}';
    }
}
