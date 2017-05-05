package Task7_Figure;

/**
 * st0ll1
 * 05.05.17
 */
public class Main {
    public static void main(String[] args) {

        // Круг
        Circle circle = new Circle(10, 10, 3);
        circle.setName("Я круг!!!");
        circle.display();
        System.out.println("Мой радиус равен: " + circle.getRadius());

        // меняем параметры
        circle.setRadius(4);
        circle.setX(2);
        circle.setY(3);
        System.out.println();           // просто пустая строка (разделитель)
        circle.display();
        System.out.println("Мой радиус равен: " + circle.getRadius());

        System.out.println();

        // Квадрат
        Square square = new Square(10, 10, 5, 5);
        square.setName("Я квадрат!!!");
        square.display();
        // меняем параметры
        square.setX(2);
        square.setY(3);
        System.out.println();           // просто пустая строка (разделитель)
        square.display();
    }
}
