package Task1_Branches_Cicles.MaxNegativeNumber;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Программа находит максимальное неположительное число из последовательности N чисел
 * длиной N<20
 */

public class MaxNumber {
    public static void main(String[] args) {

        int number = 0;                                // число в последовательности
        int quantity = 0;                              // длина последовательности

        Scanner input = new Scanner(System.in);

        System.out.print("Введите длину последовательности: ");
        quantity = input.nextInt();                    // получаем длину последовательности

/* -------------------------------------- Длина последовательности ------------------------------------------------- */
        if (quantity <= 0 || quantity > 20) {           // длина не больше 20
            System.out.println("Введите длину от 0 до 20");
            System.exit(0);
        }

/* -------------------------------------- Ввод элементов последовательности ---------------------------------------- */
        boolean flag = false;                          // флаг наличия отрицательного числа в последовательности
        int counter = 0;                               // счетчик отрицательных чисел
        // добавим массив для хранения отрицательных чисел
        ArrayList<Integer> arrayInteger = new ArrayList<Integer>(quantity);

        for (int i = 0; i < quantity; i++) {
            System.out.print("Введите число: ");
            number = input.nextInt();
            if (number < 0) {                           // если число отрицательное
                counter++;                              // увеличим счетчик на 1
                arrayInteger.ensureCapacity(counter);   // изменим емкость массива
                flag = true;
                arrayInteger.add(number);
            }
        }

        if (flag == false) {
            System.out.println("Отрицательных чисел нет!!!");
            System.exit(0);
        }

/* -------------------------------------- Поиск максимального отрицательного числа --------------------------------- */

        int maxNumber = arrayInteger.get(0);
        for (int i = 0; i < arrayInteger.size(); i++) {
            if (arrayInteger.get(i) >= 0) {
                continue;
            } else if (arrayInteger.get(i) >= maxNumber)
                maxNumber = arrayInteger.get(i);
        }
        System.out.println("Максимальное неположительное число в последовательности: "
                + maxNumber);
    }
}
