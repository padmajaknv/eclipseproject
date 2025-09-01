package Snehitha;

public class Overloading {
    void a(int i) {
        System.out.println("Integer value:"+i);
    }
    void a(float j) {
        System.out.println("Float value:"+j);
    }
    void a(char k) {

        System.out.println("Character:"+k);
    }
    public static void main(String[] args) {
        Overloading o= new Overloading();
        o.a(10);
        o.a(10.5f);
        o.a('S');
    }
}
