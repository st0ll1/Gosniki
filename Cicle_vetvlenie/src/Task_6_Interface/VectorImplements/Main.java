package Task_6_Interface.VectorImplements;

/**
 * st0ll1
 * 02.05.17
 */
public class Main {
    public static void main(String[] args) {
        double[] vector = new double[]{1, 2, 3, 4};
        double[] vector1 = new double[]{5, 5, 7, 10};

        Vector obj = new Vector(vector);
        Vector obj1 = new Vector(vector1);

        // установка вектора
        Vector obj5 = new Vector();
        Vector obj6 = new Vector();
        obj5.setVector(vector);
        obj6.setVector(vector1);

        System.out.println("Размеры векторов: ");
        System.out.println(obj.size());
        System.out.println(obj1.size());


        System.out.println("Умножение вектора на число");
        double[] vector5 = Vector.multElementVectors(obj5, 2.0);
        for (double elem : vector5) {
            System.out.print(elem + " ");
        }
        System.out.println();


        double[] vector3 = Vector.sumVectors(obj, obj1);
        System.out.println("Результат сложения двух векторов: ");
        for (double elem : vector3) {
            System.out.print(elem + " ");
        }

        System.out.println();
        System.out.println("Сумма элементов векторов равна: ");
        double[] vector4 = Vector.sumElementVectors(obj, obj1);
        for (double elem : vector4) {
            System.out.print(elem + " ");
        }
    }
}
