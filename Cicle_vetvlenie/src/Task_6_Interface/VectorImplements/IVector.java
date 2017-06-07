package Task_6_Interface.VectorImplements;

/**
 * Интерфейс взаимодействия с векторами. В качестве вектора используется динамический массив
 */
public interface IVector {
    int size();                                     // получение размера вектора

    double[] getVector();                           // получение вектора

    void setVector(double[] vector);                // установка вектора

    IVector multElementVectors(double number);      // умножение вектора на число

    IVector sum(IVector obj);                       // сложение векторов

    double scalarMultVectors(IVector obj);          // скалярное произведение векторов
}
