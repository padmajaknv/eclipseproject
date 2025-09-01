package JavaConcepts;

public class staticKeyword {
    int x = 5;
    static int ss = 3;
    void a(){
        System.out.println("void a");
    }

    static void c(){
        System.out.println("Void c");
    }
}

class example{
    int y = 6;
    static int sy = 2;
    void b(){
        System.out.println("Void b");
    }

    static void d(){
        System.out.println("Void d");
    }

    static{
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        staticKeyword sk = new staticKeyword();
        System.out.println(sk.x);
        example ex = new example();
        System.out.println(ex.y);
        sk.a();
        ex.b();
        System.out.println(staticKeyword.ss);
        System.out.println(example.sy);
        staticKeyword.c();
        example.d();
        methods mm = new methods();
        mm.h(1,1.2f,'1');
    }
}

/*
static keyword can be used for methods, variables, classes & blocks.
 */