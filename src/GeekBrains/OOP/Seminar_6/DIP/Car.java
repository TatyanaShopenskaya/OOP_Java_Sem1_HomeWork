package GeekBrains.OOP.Seminar_6.DIP;

public class Car implements Engine {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        engine.start();
    }
}