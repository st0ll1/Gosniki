package Task2_Arrays.ArraySumDoubleAbs;

import java.util.Scanner;

/**
 * st0ll1
 * 24.04.17
 * Программа, вычисляющая сумму элементов, не превосходящих по модулю заданное число, в массиве.
 * Количество элементов массива не больше 20
 */
public class ArraySumDoubleAbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;                               // сумма вещественных чисел в массиве
        double number;                                  // числа - элементы массива

        // Заданное число
        System.out.print("Введите положительное число с которым будут сравниваться модули чисел в массиве: ");
        final double compareNumb = input.nextDouble();

        // Ввод и проверка количества элементов в массиве
        System.out.print("Введите количество элементов в массиве: ");
        final int N = input.nextInt();                  // Количество элементов в массиве
        if (N > 20) {
            System.out.println("Количество элементов превышает" +
                    "максимально допустимый размер");
            System.exit(0);
        }

        // Заполним массив
        double[] arrayDouble = new double[N];           // Массив вещественных чисел
        for (int i = 0; i < N; i++) {
            System.out.print("Введите число: ");
            number = input.nextDouble();
            if (Math.abs(number) < compareNumb) {       // Здесь непонял условие задачи !!!!
                arrayDouble[i] = number;                // Сравнивать модуль числе (или модуль заданного числа х.з )
            }
        }

        for (double temp : arrayDouble) {
            sum += temp;
        }
        System.out.println("Сумма чисел равна: " + sum);
    }
}
