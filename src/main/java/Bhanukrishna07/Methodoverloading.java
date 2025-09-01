package Bhanukrishna07;

public class Methodoverloading {
    void a(){
        System.out.println("hello world");
    }
    int a(int x){
        return x+2;
    }
    int a(int x,int y){
        System.out.println("sum of the numbers");
        return x+y;
    }
    float a(int x,float y){
        System.out.println("subtraction of numbers");
        return x-y;
    }
    public static void main(String[] args) {
        Methodoverloading mo=new Methodoverloading();
        mo.a();
        int a=mo.a(2);
        System.out.println(a);
       int b= mo.a(2,6);
        System.out.println(b);
       float c=mo.a(3,1.2f);
        System.out.println(c);
    }
}
