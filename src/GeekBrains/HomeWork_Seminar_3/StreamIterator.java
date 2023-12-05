//package GeekBrains.HomeWork_Seminar_3;
//
//import java.util.Iterator;
//import java.util.List;
//
//public class StreamIterator implements Iterator<Group> {
//    private final List<Group> groupList; //создали приватную переменную final, в кот будет храниться список со студенами
//    private int counter;    ////создали приватную переменную counter, чтобы смотреть на каком элементе списка мы сейчас находимся
//
//    public StreamIterator(Stream stream) {
//        this.groupList = stream.getGroup();
//        this.counter = 0;     //каунтер=0
//    }
//
//    @Override
//    public boolean hasNext() {   //метод, кот говорит, есть ли у нас след элемент
//        return counter< groupList.size();   //т.е. элемент должен быть в пределах нашего массива
//    }
//
//    @Override
//    public Group next() {   //метод, кот возвращает нам след элемент
//        if(hasNext()){
//            return groupList.get(counter++);
//        }
//        return null;
//    }
//}
