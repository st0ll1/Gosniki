package Task5_Classes;

/**
 * @author Lopatin Alexandr
 *         Класс содержит методы для работы с матрицами
 */
public class MatrixClass {

    private int[][] matrixA;
    private int[][] matrixB;
    private int rowA;
    private int rowB;
    private int columnB;
    private int columnA;
    private int inner;
    private int resultMutrix[][];


    public MatrixClass(int[][] matrixA, int[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        rowA = matrixA.length;                               // количество строк матрицы A
        rowB = matrixB.length;                               // количество строк матрицы B
        columnA = matrixA[0].length;                         // количество столбцов матрицы A
        columnB = matrixB[0].length;                         // количество столбцов матрицы B
        inner = matrixB.length;                              // количество строк матрицы B (или столбцов в A)
        resultMutrix = new int[rowA][columnB];
    }


    // Сеттеры
    public void setMatrixA(int[][] matrixA) {
        this.matrixA = matrixA;
    }

    public void setMatrixB(int[][] matrixB) {
        this.matrixB = matrixB;
    }


    /**
     * Умножение матриц.
     * Ограничение: Количество столбцов первой матрицы должно соответствовать
     * количеству строк второй матрицы
     * @return Возвращает результирующую матрицу
     */
    public int[][] multiplyMatrix() {
        if (columnA == rowB ) {
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    // Умножим строку матрицы matrixA на столбец матрицы matrixB
                    for (int k = 0; k < inner; k++) {
                        resultMutrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        } else {
            System.out.println("Количество столбцов матрицы A не соответствует количеству строк матрицы B");
            System.exit(0);
        }
        return resultMutrix;
    }

    /**
     * Сложение матриц.
     * Ограничение: Складывать можно только матрицы одинакового размера.
     * @return Возвращает результирующую матрицу
     */
    public int[][] sumMatrix() {
        // проверка ограничения
        if ((rowA == rowB) && (columnA == columnB)) {
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    resultMutrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
        } else {
            System.out.println("Матрицы не одинакового размера");
            System.exit(0);
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
