package GeekBrains.Seminar_1;

public class BottleOfWater extends Product {
    private double volume;    //добавили параметр, кот. нет в родит. классе

    public BottleOfWater(String name, double cost, double volume) {   //задаем параметры из класса-родителя
        super(name, cost);
        this.volume = volume;     //инициализировали
    }

        public double getVolume() {
            return volume;
        }

        public void setVolume (double volume){
            this.volume = volume;
        }

        @Override
        public String toString () {
            return "BottleOfWater{" +
                    "name='" + super.getName() + '\'' +    // супер т.к. это идет о родит.класса
                    ", cost=" + super.getCost() + '\'' +
                    ", volume=" + volume +
                    '}';
        }
    }

