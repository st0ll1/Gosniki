package Task1_Branches_Cicles.OperationsOnNumbers;

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
        str = str.trim();                   // удалить пробелы с краев

        String [] strOperation = str.split(" ");

        Double firsOperand = Double.parseDouble(strOperation[0]);
        Double lastOperand = Double.parseDouble(strOperation[2]);


        switch (strOperation[1]) {
            case "+" :
                String outString = String.format("%s %s %s = %.2f", firsOperand, strOperation[1],lastOperand,
                        (firsOperand+lastOperand));
                JOptionPane.showMessageDialog(null,outString, "Результа вычислений",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            case "-" :
                String outString1 = String.format("%s %s %s = %.2f", firsOperand, strOperation[1],lastOperand,
                        (firsOperand-lastOperand));
                JOptionPane.showMessageDialog(null,outString1, "Результа вычислений",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            case "/" :
                String outString2 = String.format("%s %s %s = %.2f", firsOperand, strOperation[1],lastOperand,
                        (firsOperand/lastOperand));
                JOptionPane.showMessageDialog(null,outString2, "Результа вычислений",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            case "*" :
                String outString3 = String.format("%s %s %s = %.2f", firsOperand, strOperation[1],lastOperand,
                        (firsOperand*lastOperand));
                JOptionPane.showMessageDialog(null,outString3, "Результа вычислений",
                        JOptionPane.PLAIN_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Неизвестная операция!!!", "Error!!!",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
