package samrat;

import java.time.Year;

public class methodoverloading {

    void method1() {

        System.out.println("methods with no parameters");
    }
    void method1(int x, int y){
        System.out.println(x+y);
    }
    void method1(float y) {
        System.out.println(y);
    }
    public static void main (String[] args) {
        {
            methodoverloading mo = new methodoverloading();
            mo.method1();
            mo.method1(6, 7);
            mo.method1(6.2f);
        }
    }
}
