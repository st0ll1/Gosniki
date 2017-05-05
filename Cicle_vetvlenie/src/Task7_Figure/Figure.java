package Task7_Figure;

/**
 * Абстрактыный класс Figure
 * st0ll1
 * 05.05.17
 * Методы:
 * getArea() возвращает площадь фигуры
 * getPerimiter возвращает периметр фигуры
 * setX(), setY() задает координаты центра фигуры
 * getX(), getY() возвращает координаты центра фигуры
 * setName() задает имя фигуры
 * getName() возвращает имя фигуры
 */
public abstract class Figure {

    private double x;                                   // координаты центра (ось x)
    private double y;                                   // координаты центра (ось y)
    private String nameFigure = "Я просто фигура";

    // конструктор без параметров
    public Figure() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // конструктор с параметрами
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* ------------------------------ Сетеры и гетеры для ввода имя фигуры ----------------------------------------- */
    public void setName(String name) {
        this.nameFigure = name;
    }

    public String getName() {
        return nameFigure;
    }


    /* ------------------------------ Сетеры для задания координат фигуры ------------------------------------------ */
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    /* ------------------------------ Гетеры для получения координат фигуры ---------------------------------------- */
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /* ------------------------ Абстрактные методы для вычисления периметра и площади фигуры ----------------------- */
    public abstract double getArea();                   // площадь фигуры

    public abstract double getPerimiter();              // площадь периметра

    /* ---------------------------------------- Вывод информации о фигуре ------------------------------------------ */
    public void display() {
        System.out.println(this.getName());
        System.out.println("Моя площадь равна: " + this.getArea());
        System.out.println("Мой периметр равен: " + this.getPerimiter());
        System.out.println("Координата центра ось x: " + this.getX());
        System.out.println("Координата центра ось y: " + this.getY());
    }
}
