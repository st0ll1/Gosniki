package Task7_Figure;

/**
 * st0ll1
 * 05.05.17
 * Класс квадрат наследуется от класса Figure
 */

public class Square extends Figure {

    private double width;
    private double heigth;

    public Square() {
        super();
    }

    public Square(double x, double y, double width, double heigth) {
        super(x, y);
        this.width = width;
        this.heigth = heigth;
        if(width != heigth) {
            System.out.println("Фигура не является квадратом!!!");
            System.exit(-1);
        }
    }


    @Override
    // площадь квадрата
    public double getArea() {
        return width * heigth;
    }

    @Override
    // периметр квадрата
    public double getPerimiter() {
        return width * 4;
    }
}
