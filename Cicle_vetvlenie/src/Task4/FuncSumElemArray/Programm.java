package Task4.FuncSumElemArray;

/**
 * st0ll1
 * 27.04.17
 */
public class Programm {
    public static void main(String[] args) {
        SumElemArray objSum = null;
        int [] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4};
        try {
            objSum = new SumElemArray(12, array);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Неверный размер массива!!!");
            ex.printStackTrace();
        }

        System.out.println(objSum.sumElements());
    }
}
