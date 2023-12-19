package GeekBrains.OOP.Seminar_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Oleg");
        Human human2 = new Human("Anton");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
