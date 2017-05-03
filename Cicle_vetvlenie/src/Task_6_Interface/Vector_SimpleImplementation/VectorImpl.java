package Task_6_Interface.Vector_SimpleImplementation;

/**
 * st0ll1
 * 03.05.17
 */
public class VectorImpl {

    double x;
    double y;

    /* --------------------------------------------------- Конструкторы -------------------------------------------- */
    // конструтор без параметров
    public VectorImpl() {
        x = y = 1.0;
    }

    // конструтор с параметрами
    public VectorImpl(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // конструктор копирования
    public VectorImpl(VectorImpl vector) {
        this.x = vector.x;
        this.y = vector.y;
    }


    /* ----------------------------------------- Сеттеры, геттеры, сравнение ----------------------------------------*/

    VectorImpl getVector(){
        return new VectorImpl();
    }

    public void setVector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(VectorImpl o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VectorImpl vector = (VectorImpl) o;

        if (Double.compare(vector.x, x) != 0) return false;
        return Double.compare(vector.y, y) == 0;
    }


    /* ---------------------------------------------Сумма и разность векторов -------------------------------------- */
    // суммирование векторов
    public VectorImpl sum(VectorImpl vector) {
        return new VectorImpl(x + vector.x, y + vector.y);
    }

    // разность векторов
    public VectorImpl subtr(VectorImpl vector) {
        return new VectorImpl(x - vector.x, y - vector.y);
    }


    /* -------------------------------------------- Умножение вектора на число ------------------------------------- */
    // умножение вектора на число
    public VectorImpl mult(double number) {
        return new VectorImpl(x * number, y * number);
    }

    // умножение вектора на число c передачей объекта и числа
    public VectorImpl mult(double number, VectorImpl vector) {
        return new VectorImpl(vector.x * number, vector.y * number);
    }

    // умножение вектора на число с передачей только объекта
    public VectorImpl mult(VectorImpl vector) {
        return new VectorImpl(this.x * vector.x, vector.y * this.y);
    }

    // Вывод вектора
    public void display() {
        System.out.println("x = "+ x + " y = " + y);
    }
}
