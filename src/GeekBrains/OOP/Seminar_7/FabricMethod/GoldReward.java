package GeekBrains.OOP.Seminar_7.FabricMethod;

public class GoldReward implements IGameItem{    //саздали сундук с золотом

    @Override
    public void open() {
        System.out.println("Открыт сундук с золотом");
    }
}
