package Triangle.MultTable;

import java.util.Scanner;

/**
 * Таблица умножения
 */
public class MultTableDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер таблицы: ");
        int n = sc.nextInt();               // размерность таблицы

        System.out.print("  ");
        for (int i = 1; i <= n; i++)
            System.out.printf("%4d", i);
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.printf("%2d", i);
            for (int j = 1; j <= n; j++)
                System.out.printf("%4d", i * j);
            System.out.println();
        }
    }
}
