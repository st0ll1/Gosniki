package Task_6_Interface.Vector_SimpleImplementation;

/**
 * st0ll1
 * 03.05.17
 */
public class Programm {
    public static void main(String[] args) {
        VectorImpl obj = new VectorImpl(2.0, 3.0);

        VectorImpl obj1 = new VectorImpl(5.0, 4.0);
        VectorImpl resultObj = obj1.subtr(obj);
        resultObj.display();

    }
}
