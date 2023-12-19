package GeekBrains.OOP.Seminar_7.FabricMethod;

public class GoldGenerator implements ItemGen{
    @Override
    public IGameItem createItem() {     //это создатель сундука с золотом
        return new GoldReward();    //генерирует наши сундуки с золотом
    }
}
