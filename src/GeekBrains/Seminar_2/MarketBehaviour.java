package GeekBrains.Seminar_2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor); //метод, кот позволяет покупателям заходить в магазин/в очередь
    void releaseFromMarket(List<Actor> actors); //метод, в кот принимается список и по нему выгоняет людей из магазина
    void update(); //метод, обновляющий информацию про магазин
}
