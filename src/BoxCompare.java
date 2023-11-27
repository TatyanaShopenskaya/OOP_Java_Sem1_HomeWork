public class BoxCompare {
    public static void main(String[] args) {
        Box current = new Box(10);
        Box another = current.copy();
        Box increase = current.increase();
//        int result = current.compare(another);
//        System.out.println(result);
        current.showVolume();
        another.showVolume();
        increase.showVolume();
        }
    }

