package Test;

import java.util.Arrays;
import java.util.Random;

/**
 * тестовый класс для примеров
 */
public class Matrix {

    /* ----------------------------------------- Поля класса --------------------------------------------------- */
    private int[][] matrixA;
    private int[][] matrixB;
    private int rowA;                       // количество рядов матрицы A
    private int rowB;                       // количество рядов матрицы B
    private int columnA;                    // количество колонок A
    private int columnB;                    // количество колонок B
    private int inner;                      // утильная переменная (количество столбцов A или рядов B)
    private int[][] resultMatrix;        // результирующая матрица

    /* ----------------------------------------- Конструкторы -------------------------------------------------- */
    public Matrix(int[][] matrixA, int[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        rowA = matrixA.length;
        rowB = matrixB.length;
        columnA = matrixA[0].length;
        columnB = matrixB[0].length;
        inner = matrixB.length;
        resultMatrix = new int[rowA][columnB];
    }

    /* ----------------------------------------- Методы ------------------------------------------------------- */
    // Сеттеры и геттеры
    public int[][] getMatrixA() {
        return matrixA;
    }

    public void setMatrixA(int[][] matrixA) {
        this.matrixA = matrixA;
    }

    public int[][] getMatrixB() {
        return matrixB;
    }

    public void setMatrixB(int[][] matrixB) {
        this.matrixB = matrixB;
    }

    /* Умножение матриц.
    *  Ограничение: Количество столбцов первой матрицы должно соответствовать
    *  количеству строк второй
    *  @return resultMatrix
    */
    public int[][] multiplayMatrix() {
        if (columnA == rowB) {
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    // умножим строку матрицы A на столбец B
                    for (int k = 0; k < inner; k++) {
                        resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        } else {
            System.out.println("Размерности матриц не совпадают!!!");
            throw new ArithmeticException();
        }
        return resultMatrix;
    }   // close multiplayMatrix


    /* Сложение матриц */
    public int[][] sumMatrix() {
        if ((columnA == columnB) && (rowA == rowB)) {
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
        } else {
            System.out.println("Размерности матриц не совпадают!!!");
            throw new ArithmeticException();
        }
        return resultMatrix;
    }

    /* Вычитание матриц */
    public int[][] subtrMatrix() {
        if ((columnA == columnB) && (rowA == rowB)) {
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
                }
            }
        } else {
            System.out.println("Размерности матриц не совпадают!!!");
            throw new ArithmeticException();
        }
        return resultMatrix;
    }

    /* вывод результирующей матрицы */
    public void display() {
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.format("%4d", resultMatrix[i][j]);
            }
            System.out.println();
        }
    }
}


