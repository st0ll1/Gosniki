package Task_6_Interface.VectorImplements;

/**
 * st0ll1
 * 02.05.17
 * Интерфейс взаимодействия с векторами. В качестве вектора используется динамический массив
 *
 */
public interface IVector {
    int size();                                     // получение размера вектора

    double[] getVector();                           // получение вектора

    void setVector(double[] vector);                // установка вектора

    IVector multElementVectors(double number);      // умножение вектора на число

    IVector sum(IVector obj);                // сложение векторов
}
