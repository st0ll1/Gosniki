package Task4.FuncSumElemArray;

/**
 * st0ll1
 * 27.04.17
 */
public class SumElemArray {
    private int N;
    private int[] array = new int[N];
    private int sum = 0;

    public SumElemArray(int n, int[] array) {
        if(n > 20 || array.length > 20 || n != array.length) {
//            System.out.println("Превышен максимальный размер массива");
//            System.exit(0);
            throw new ArrayIndexOutOfBoundsException();
        }
        N = n;
        this.array = array;
    }

    public int sumElements() {
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}

