package madhumitha;

public class MethodOverloading {
    int a(){
        System.out.println("Method without Parameters" );
        return 0;

    }
    int a(int x,int y){
        System.out.println("Method with Parameters");
        System.out.println(x+y);
        return 0;
    }
    public static void main(String[] args) {
        MethodOverloading ml = new MethodOverloading();
        ml.a();
        ml.a(2,3);

    }
}
