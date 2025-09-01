package JavaConcepts;

public class inheritance1 {
    int x = 5;
    static int s=7;
    void a(){
        System.out.println("Void a");
    }
}

class example4{}

class example3 extends inheritance1{

    /*
    inheritance1 - Parent or super class

    example3 - Child or sub class
     */
    int y=6;

    void a(){
        System.out.println("Overriding method");
    }

    void b(){
        System.out.println("Void b");
    }

    void c(){
        super.a();
        System.out.println(super.x);
    }

    public static void main(String[] args) {
//        inheritance1 in = new inheritance1();
//        System.out.println(in.x);

        example3 ex = new example3();
        System.out.println(ex.y);

//        in.a();
        ex.b();

        System.out.println(ex.x);
        ex.a();
        System.out.println(example3.s); //accessing parent class static variable
        ex.c();
//        super.a();
    }
}

/*
Acquiring the method from the parent class and modifying the method
body inside the child class is Method Overriding.

Method name & params should be same b/w Parent & Child methods.
 */