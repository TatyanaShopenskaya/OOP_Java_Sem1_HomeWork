public class Box1 {
    int size;

    Box1(int size) {
        this.size = size;
    }

    int getVolume() {
        return (size * size);
    }

    int compare(Box1 another) {     //метод, в кот в кач-ве параметра принимается другая коробка!
        int currentVolume = getVolume();
        int anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (currentVolume < anotherVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    Box1 copy(int size) {
        return new Box1(this.size);
    }

//    Box1 increase(Box1){
//        return new Box1(size*2);
//    }
}




