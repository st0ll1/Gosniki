package Task5_Classes;

/**
 * st0ll1
 * 27.04.17
 */
public class Main {
    public static void main(String[] args) {

        int[][] matrixA =
                        {{33, 34, 12},
                        {33, 19, 10},
                        {12, 14, 17}};

        int[][] matrixB =
                        {{10, 11, 34},
                        {33, 45, 17},
                        {45, 63, 12}};


        MatrixClass obj = new MatrixClass(matrixA, matrixB);

        /* ----------------------------------------- Умножение матриц ----------------------------------------------- */
        System.out.println("Результат умножения матриц");
        try {
            obj.multiplyMatrix();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.exit(0);
        }

        obj.display();

        System.out.println();

        /* ------------------------------------------ Сложение матриц ----------------------------------------------- */
        System.out.println("Результат сложения матриц");
        try {
            obj.sumMatrix();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        obj.display();

        System.out.println();

        /* ------------------------------------------- Разница матриц ----------------------------------------------- */
        System.out.println("Результат вычитания матриц");
        try {
            obj.subtrMatrix();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        obj.display();

    }
}
