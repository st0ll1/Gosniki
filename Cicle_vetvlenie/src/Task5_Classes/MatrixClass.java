package Task5_Classes;

/**
 * @author Lopatin Alexandr
 *         Класс содержит методы для работы с матрицами
 */
public class MatrixClass {

    private int[][] matrixA;
    private int[][] matrixB;
    private int row;
    private int column;
    private int inner;
    private int resultMutrix[][];


    public MatrixClass(int[][] matrixA, int[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        row = matrixA.length;                               // количество строк матрицы A
        column = matrixB[0].length;                         // количество столбцов матрицы B
        inner = matrixB.length;                             // количество строк матрицы B (или столбцов в A)
        resultMutrix = new int[row][column];
    }


    // Сеттеры
    public void setMatrixA(int[][] matrixA) {
        this.matrixA = matrixA;
    }

    public void setMatrixB(int[][] matrixB) {
        this.matrixB = matrixB;
    }


    /**
     * Умножает матрицы
     * @return Возвращает результирующую матрицу
     */
    public int[][] multiplyMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // Умножим строку матрицы matrixA на столбец матрицы matrixB
                for (int k = 0; k < inner; k++) {
                    resultMutrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return resultMutrix;
    }

    /**
     * Вывод результирующей матрицы на экран
     */
    public void display() {
        // Выводим результирующую матрицу
        for (int i = 0; i < resultMutrix.length; i++) {
            for (int j = 0; j < resultMutrix[0].length; j++) {
                System.out.format("%6d", resultMutrix[i][j]);
            }
            System.out.println();
        }
    }

}
