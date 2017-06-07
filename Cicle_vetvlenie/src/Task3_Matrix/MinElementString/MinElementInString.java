package Task3_Matrix.MinElementString;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Написать программу, формирующую массив минимальных элементов строк матрицы (10x10)
 */
public class MinElementInString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double minElement;                                  // минимальный элемент в строке


        // Ввод размеров матрицы
        System.out.println("Введите размер матрицы NxM");
        System.out.print("N = ");
        int N = input.nextInt();
        System.out.print("M = ");
        int M = input.nextInt();

        double matrix[][] = new double[N][M];               // двумерный массив
        double[] arrayMinElements = new double[N];          // массив для минимальных элементов строк

        // заполним матрицу
        System.out.println("Ввод элементов матрицы");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Введите элемент: ");
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // найдем минимальный элемент в строках матрицы
        for (int i = 0; i < N; i++) {
            minElement = matrix[i][0];
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
            arrayMinElements[i] = minElement;
        }
        System.out.println("Массив минимальных элементов: " + Arrays.toString(arrayMinElements));
    }
}
