package MaxNegativeNumber;

import java.util.Scanner;

/**
 * Программа находит максимальное неположительное число из последовательности N чисел
 * длиной N<20
 */

public class MaxNumber {
    public static void main(String[] args) {

        int minNumber = Integer.MIN_VALUE;             // минимальное число из отрицательных
        int number = 0;                                // число в последовательности
        int quantity = 0;                              // длина последовательности

        Scanner input = new Scanner(System.in);

        System.out.print("Введите длину последовательности: ");
        quantity = input.nextInt();                    // получаем длину последовательности

/* -------------------------------------- Длина последовательности ------------------------------------------------- */
        if (quantity > 20) {                           // если длина больше 20 выходим с предупреждением
            System.out.println("Введите длину меньше 20");
            System.exit(0);
        }

/* -------------------------------------- Ввод элементов последовательности ---------------------------------------- */
        boolean flag = false;                          // флаг наличия отрицательного числа в последовательности
        int[] arrayInt = new int[quantity];            // добавим массив для хранения отрицательных чисел

        for (int i = 0; i < quantity; i++) {
            System.out.print("Введите число: ");
            number = input.nextInt();
            if (number < 0 ) {                          // && number > minNumber
                flag = true;
                arrayInt[i] = number;
            }
        }

        if (flag == false) {
            System.out.println("Отрицательных чисел нет!!!");
            System.exit(0);
        }

/* -------------------------------------- Поиск максимального отрицательного числа --------------------------------- */

        int maxNumber = minNumber;
        for (int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i] == 0) {
                continue;
            } else if (arrayInt[i] >= maxNumber)
                maxNumber = arrayInt[i];
                //minNumber = arrayInt[i];
        }
        System.out.println("Максимальное неположительное число в последовательности: "
                + maxNumber);
    }
}
