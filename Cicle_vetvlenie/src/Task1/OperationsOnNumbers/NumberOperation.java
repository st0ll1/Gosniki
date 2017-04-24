package Task1.OperationsOnNumbers;

import javax.swing.*;

/**
 * st0ll1
 * 23.04.17
 */
public class NumberOperation {
    public static void main(String[] args) {

        // строка с операцией
        String str;

        str = JOptionPane.showInputDialog(null, "Введите выражение",
                "Ввод операции", JOptionPane.PLAIN_MESSAGE);

        String [] strOperation = str.split(" ");

        Double firsOperand = Double.parseDouble(strOperation[0]);
        Double lastOperand = Double.parseDouble(strOperation[2]);

        // Форматированная строка вывода
        // Сдесь ПОКА НЕ ДОДЕЛАНО - операция не верная
        String outString = String.format("%s %s %s = %.2f", firsOperand, strOperation[1],lastOperand,
                (firsOperand+lastOperand));

        switch (strOperation[1]) {
            case "+" :
                JOptionPane.showMessageDialog(null,outString, "Результа вычислений",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            case "-" :
                JOptionPane.showMessageDialog(null,outString, "Результа вычислений",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            case "/" :
                JOptionPane.showMessageDialog(null,outString, "Результа вычислений",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            case "*" :
                JOptionPane.showMessageDialog(null,outString, "Результа вычислений",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Неизвестная операция!!!", "Error!!!",
                        JOptionPane.ERROR_MESSAGE);
                break;

        }
    }
}
