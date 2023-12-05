//package GeekBrains.HomeWork_Seminar_3;
//
//import java.util.Iterator;
//import java.util.List;
//
//public class Stream implements Iterable<Group> {
//    private List<Group> groupList;
//
//    public Stream(List<Group> groupList) {   //создали список студентов
//        this.groupList = groupList;
//    }
//
//    public List<Group> getGroup() {
//        return groupList;
//    }
//
//    public void addGroup(Group group) {    //метод добавления студента в список
//        groupList.add(group);
//    }
//
//    @Override
//    public Iterator<Group> iterator() {
//        return new StreamIterator(this);
//    }
//
//    public int countGroup() {
//        for (int i = 0; i < groupList.size(); i++) {
//            System.out.println(i);
//        }
//        return i;
//    }
//}

