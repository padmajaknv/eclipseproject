package Snehitha;

public class voidmethods {
    void a(){
        System.out.println("method a()");
    }
    void a(int x){
        System.out.println("x is"+x);

    }
    void a(float y){
        System.out.println("y is"+y);
    }
    public static void main(String[] args) {
        voidmethods o=new voidmethods();
        o.a(10);
        o.a(9);
        o.a(89.0f);


    }
}
