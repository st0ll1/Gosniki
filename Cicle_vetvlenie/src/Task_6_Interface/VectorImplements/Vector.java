package Task_6_Interface.VectorImplements;

/**
 * st0ll1
 * 02.05.17
 */
public class Vector implements IVector {

    private double[] vector;

    // конструктор
    public Vector() {
        this.vector = null;
    }

    public Vector(double[] vector) {
        this.vector = vector;
    }

    @Override
    public void setVector(double[] vector) {
        this.vector = vector;
    }

    @Override
    public int size() {
        return vector.length;
    }

    @Override
    public double[] getVector() {
        return vector;
    }

    /**
     * Суммирует два вектора
     *
     * @param vector1
     * @param vector2
     * @return Результирующий вектор
     */
    public static double[] sumVectors(IVector vector1, IVector vector2) {
        double[] resultVector = new double[vector1.size() + vector2.size()];
        System.arraycopy(vector1.getVector(), 0, resultVector, 0, vector1.size());
        System.arraycopy(vector2.getVector(), 0, resultVector, vector1.size(), vector2.size());
        return resultVector;
    }


    /**
     * Складывает элементы двух векторов
     *
     * @param vector1
     * @param vector2
     * @return Результирующий вектор
     */
    public static double[] sumElementVectors(IVector vector1, IVector vector2) {
        double[] resultVector = new double[vector1.size()];
        if (vector1.size() != vector2.size()) {
            System.err.println("Size vector error!");
            System.exit(-1);
        }
        for (int i = 0; i < vector1.size(); i++) {
            resultVector[i] = vector1.getVector()[i] + vector2.getVector()[i];
        }
        return resultVector;
    }

    /** Умножение вектора на число
     *
     * @param vector1
     * @param number
     * @return Массив double элементы которого умножены на число
     */
    public static double[] multElementVectors(IVector vector1, double number) {
        double[] resultVector = new double[vector1.size()];
        for (int i = 0; i < vector1.size(); i++) {
            resultVector[i] = vector1.getVector()[i] * number;
        }
        return resultVector;
    }

}
