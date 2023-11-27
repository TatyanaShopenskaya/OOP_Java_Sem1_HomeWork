public class Pryamougolnik {
    double length;
    double wight;

    void setDimensPryamoug(double length, double wight) {
        this.length = length;
        this.wight = wight;
    }

    double getSquarePr() {
        double square = length * wight;
        return square;
    }

    double showSquare() {
        System.out.println(getSquarePr());
        return getSquarePr();
    }
}
