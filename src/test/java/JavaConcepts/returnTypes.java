package JavaConcepts;

public class returnTypes {

    int a(){
        System.out.println("method with int return type");
        return 3;
    }

    int b(int x){
        System.out.println("Method with int parameter");
        return x+2;
    }

    float c(int x, float y){
        System.out.println("Method with 2 parameters");
        return x+y;
    }

    public static void main(String[] args) {
        returnTypes rt = new returnTypes();
        int i = rt.a();
        System.out.println(i+2);
        int j = rt.b(1);
        System.out.println(j);
        float k = rt.c(1,1.2f);
        System.out.println(k);
    }

}
