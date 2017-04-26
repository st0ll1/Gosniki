package Task3.FillInArray;

/**
 * st0ll1
 * 26.04.17
 * Заполнить двумерный массив следующим образом 123, 234, 345
 */
public class FillArray {
    public static void main(String[] args) {

        int N = 10;
        int M = 10;
        int number = 1;
        int[][] twoMatrix = new int[N][M];

        // заполним матрицу заданным образом
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                twoMatrix[i][j] = number++;
            }
//            number = number - 2;
            number = number - (N - 1); //
        }

        // выведем матрицу
        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < M; j++) {
                System.out.print(twoMatrix[i][j] + " ");
            }
        }
    }
}
