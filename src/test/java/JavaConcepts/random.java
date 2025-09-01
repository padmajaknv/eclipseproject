package JavaConcepts;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(1000));
        System.out.println(r.nextFloat());
    }
}
