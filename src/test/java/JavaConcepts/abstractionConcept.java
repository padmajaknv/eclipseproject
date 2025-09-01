package JavaConcepts;

abstract class example2{
    void a(){
        System.out.println("Void a"); //concrete methods
    }

    abstract void b(); //abstract method
}

public class abstractionConcept extends example2{
    void b(){
        System.out.println("Void b");
//        super.b();
    }

//    abstract void c();

    public static void main(String[] args) {
        abstractionConcept ac = new abstractionConcept();
        ac.a();
        ac.b();
//        example2 e2 = new example2();
    }
}

/*
Abstract Class - Contains concrete and abstract methods.
Concrete Class - Contains concrete methods only.

Abstract Method- Methods with no method body
Concrete Method- Methods with method body
 */