package RandomExample;

import java.util.Random;

/**
 * Пример работы с рандомами
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)-5);        // nextInt(k) [a, b] b-a
    }
}
