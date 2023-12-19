package GeekBrains.OOP.Seminar_7.FabricMethod;

public class GemGenerator implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GemReward();      //генерация сундука с изумрудом
    }
}
