package Task7_Figure;

/**
 * st0ll1
 * 05.05.17
 * Класс круг, наследуется от класса Figure
 */
public class Circle extends Figure {

    private double radius;

    public Circle() {
        super();
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public double getPerimiter() {
        return 2*Math.PI*radius;
    }
}
