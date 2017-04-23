package NumberOfDigits;

import javax.swing.JOptionPane;

/*
 * Задача нахождения количества цифр в числе N (N < 10^9)
 */

public class Main {
    public static void main(String[] args) {

        int number = 1;                              // количество цифр
        Integer digit = 0;
        try {
            // Вводим число в котором считаем количество цифр
            digit = Integer.parseInt(JOptionPane.showInputDialog("Введите число"));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Число введено неверно " + ex,
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // Здесь сам алгоритм
        while ((digit /= 10) > 0) {
            if (digit > (Math.pow(10, 9))) {
                JOptionPane.showMessageDialog(null, "Число больше максимально допустимого",
                        "Ошибка", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            number++;
        }
        // Выводим в графическое окно результат
        JOptionPane.showMessageDialog(null, "Количество цифр в числе: " + number,
                "Количество цифр в числе", JOptionPane.PLAIN_MESSAGE);
    }
}
