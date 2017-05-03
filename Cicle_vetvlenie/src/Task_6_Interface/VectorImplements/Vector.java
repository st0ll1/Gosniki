package Task_6_Interface.VectorImplements;

/**
 * st0ll1
 * 02.05.17
 */
public class Vector implements IVector {

    private double[] vector;

    /* ----------------------------------------------- Конструктор ------------------------------------------------ */
    public Vector() {
        this.vector = null;
    }

    public Vector(double[] vector) {
        this.vector = vector;
    }

    // копирующий конструктор
    public Vector(Vector obj) {
        this.vector = obj.getVector();
    }

    // метод копирующий объект
//    public Vector copy() {
//        return new Vector(this);
//    }

    /* ----------------------------------------------- Сеттеры,геттеры --------------------------------------------- */
    @Override
    public void setVector(double[] vector) {
        this.vector = vector;
    }

    // размер вектора
    @Override
    public int size() {
        return vector.length;
    }

    @Override
    public double[] getVector() {
        return vector;
    }


    /* -------------------------------------- Методы работы с векторами -------------------------------------------- */
    /**
     * Суммирует текущий объект с объектом переданным в качестве параметра
     * @param obj типа Ivector
     * @return экземпляр Ivector
     */
    @Override
    public IVector sum(IVector obj) {
        double[] resultVector = new double[this.size() + obj.size()];
        System.arraycopy(this.getVector(), 0, resultVector, 0, obj.size());
        System.arraycopy(obj.getVector(), 0, resultVector, this.size(), obj.size());
        return new Vector(resultVector);
    }


    /**
     * Суммирует два вектора (объекты передаются в качестве параметра)
     * @param vector1
     * @param vector2
     * @return Результирующий объект вектора */
    public static IVector sumVectors(IVector vector1, IVector vector2) {
        double[] resultVector = new double[vector1.size() + vector2.size()];
        System.arraycopy(vector1.getVector(), 0, resultVector, 0, vector1.size());
        System.arraycopy(vector2.getVector(), 0, resultVector, vector1.size(), vector2.size());
        return new Vector(resultVector);
    }


    /**
     * Складывает элементы двух векторов
     * @param vector1
     * @param vector2
     * @return Результирующий вектор
     */
    public static IVector sumElementVectors(IVector vector1, IVector vector2) {
        double[] resultElemVector = new double[vector1.size()];
        if (vector1.size() != vector2.size()) {
            System.err.println("Size vector error!");
            System.exit(-1);
        }
        for (int i = 0; i < vector1.size(); i++) {
            resultElemVector[i] = vector1.getVector()[i] + vector2.getVector()[i];
        }
        return new Vector(resultElemVector);
    }


    /** Умножение вектора на число
     * @param number
     * @return Массив double элементы которого умножены на число
     */
    @Override
    public IVector multElementVectors(double number) {
        double[] resultVector = new double[this.size()];
        for (int i = 0; i < this.size(); i++) {
            resultVector[i] = this.getVector()[i] * number;
        }
        return new Vector(resultVector);
    }
}
