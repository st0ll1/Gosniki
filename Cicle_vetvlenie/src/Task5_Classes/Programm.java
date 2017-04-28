package Task5_Classes;

/**
 * st0ll1
 * 27.04.17
 */
public class Programm {
    public static void main(String[] args) {
        int[][] matrixA =
                        {{33, 34, 12},
                        {33, 19, 10},
                        {12, 14, 17},
                        {84, 24, 51},
                        {43, 71, 21}};

        int[][] matrixB =
                        {{10, 11, 34, 55},
                         {33, 45, 17, 81},
                         {45, 63, 12, 16}};

        MatrixClass obj = new MatrixClass(matrixA, matrixB);

        System.out.println("Результат умножения матриц");
        obj.multiplyMatrix();
        obj.display();

        System.out.println();

        System.out.println("Результат сложения матриц");
        obj.sumMatrix();
        obj.display();



    }
}
