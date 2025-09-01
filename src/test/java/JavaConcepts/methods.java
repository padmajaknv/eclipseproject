package JavaConcepts;

public class methods {

    //void method
    //return Type method

    //O/P is a value that can be stored in a variable

    public void a(){
        System.out.println("Hello World!!!!");
    }

    /*
    Method b with 1 in parameter
     */
    void b(int x){  //parameter or argument
        System.out.println("Method b with int parameter");
        System.out.println(x+5);
    }

    void c(int x, int y){
        System.out.println(x+y);
    }

    /**
     * Method to verify if any integer is even or not
     * @author : Quality Thought
     * @param : An Integer value
     * @return: No return value
     */
    void verifyEven(int x){
        if(x%2==0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }

    void g(int x, float y){
        System.out.println(x+y);
    }

    void h(int x, float y, char z){
        System.out.println(x+y+z);
    }


    void printArray(){
        int[] x = {1,2,3,4,5};
        for(int i:x){
            System.out.println(i);
        }
    }

    void printArray2(int[] x){
        for(int i:x){
            System.out.println(i);
        }
    }

    void naturalSum(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum= i*(i+1)/2;
        }
        System.out.println(sum);
    }

    void evenArray(int[] x){
        for(int i=0;i<x.length;i=i+2){
            System.out.println(x[i]);
        }
    }

    void varArgs(int... x){
        System.out.println(x.length);
    }

    public static void main(String[] args) {
        methods m = new methods();
//        System.out.println(m.a());
        m.a();
        m.a();
        m.varArgs();
        m.varArgs(1,2,3,4,5,6,7,8,9,0);
        m.a();
        m.b(2);
        m.b(4);
        m.b(7);
        m.h(1,1.2f,'1');
        m.c(1,2);
        m.c(3,4);
        m.c(5,6);
        m.verifyEven(3);
//        if(3%2==0) System.out.println("Even Number");
//        else System.out.println("Odd Number");
        m.verifyEven(4);
//        if(4%2==0) System.out.println("Even Number");
//        else System.out.println("Odd Number");
        m.verifyEven(9);
//        if(9%2==0) System.out.println("Even Number");
//        else System.out.println("Odd Number");
        int[] x = {1,2,3,4,5};
        m.printArray2(x);
        m.naturalSum(35);
        m.naturalSum(21);
        m.evenArray(x);

        methods2 m2 = new methods2();
        m2.defaultMethod();
//        m2.privateMethod();
    }


}

class methods2{
    void defaultMethod(){
        System.out.println("Default method");
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }
}