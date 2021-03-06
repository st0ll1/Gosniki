package Task2_Arrays.ArraySumIntegerEven;

import java.util.Scanner;
/*
 * Дан одномерный массив из не более чем 20 целых чисел. Написать программу,
 * вычисляющую количество чётных положительных элементов в этом массиве.*/

public class ArraySumInt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        final int N = input.nextInt();        // Количество элементов в массиве
        if (N > 20) {
            System.out.println("Количество элементов превышает" +
                    "максимально допустимый размер");
            System.exit(0);
        }
        int[] array = new int[N];             // массив положительных чисел

        // заполним массив
        for(int i = 0; i<N; i++) {
            System.out.print("Введите число ");
            array[i] = input.nextInt();;
        }

        int count = 0;                         // счетчик четных элементов

        for (int i = 0; i < N; i++) {
            if ((array[i] > 0) && (array[i] % 2) == 0) {
                count++;
            }
        }

        System.out.println("Количество четных положительных элементов в массиве: " + count);
    }
}
