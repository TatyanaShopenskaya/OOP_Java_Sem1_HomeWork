package GeekBrains.Seminar_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Actor> queu = new ArrayList<>(); //создали список экторов, встающих в очередь

    @Override
    public void acceptToMarket(Actor actor) {   //1. наш эктор зашел в очередь
        System.out.println(actor.getName() + " зашел в магазин");
        takeInQueue(actor);    //т.е. это метод отвечает, за то, чтобы было отображено, что эктор встал в очередь
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: queu){     //пробегаемся по новому списку и выгоняем тех, кто уже не в очереди  из магазина
            queu.remove(actor);
            System.out.println(actor.getName() + " вышел из магазина");
        }
    }

    @Override
    public void update() {    //обновление
        makeOrders();
        takeOrders();
        releaseFromQueue();
        //releaseFromMarket();
    }

    @Override
    public void takeInQueue(Actor actor) {       //2. эктор встал в очередь
        queu.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void makeOrders() {      //3. эктор делает заказ
        for (Actor actor : queu) {      //пробегаемcя по очереди
            if (!actor.isMakeOrder) {     //если эктор еще не делал заказ, то у него его принимают (заказ)
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queu) {      //пробегаемcя по очереди
            if (actor.isMakeOrder) {     //если эктор сделал заказ, то ему его выдают
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " забрал свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>(); //создали новый список для теех, кто уже забрал заказ
        for (Actor actor : queu) {      //пробегаемcя по очереди
            if (actor.isTakeOrder) {     //если эктор уже забрал заказ, то его добавляют в список на выход из очереди
                releaseActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releaseActors);
    }
}
