package Task3.SummElemMainDiagonalMatrix;

/**
 * st0ll1
 * 26.04.17
 * Программа вычисляющая сумму элементов главной диагонали матрицы
 */
public class SumElemMatrixDiag {
    public static void main(String[] args) {
        int N = 3;
        int M = 3;
        int number = 1;
        int sum = 0;
        int[][] twoMatrix = new int[N][M];

        // заполним матрицу произвольным образом
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                twoMatrix[i][j] = number++;
            }
        }

        // выведем матрицу
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < M; j++) {
                System.out.print(twoMatrix[i][j] + " ");
            }
        }
        System.out.println();


        // сосчитаем сумму элементов главной диагонали
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == j) {
                    sum += twoMatrix[i][j];
                }
            }
        }
        System.out.println("Сумма элементов главной диагонали равна: " + sum);
    }
}
