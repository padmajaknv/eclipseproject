package JavaConcepts;

import JavaConcepts.subPackage.*;

public class accessModifiers {
    int i = 5;
    private int pi = 6;

    void a(){
        System.out.println("Void a");
    }

    private void pa(){
        System.out.println("Private void a");
    }

}

class sample2 extends subPackClass{

    public void protectedMethod(){
        System.out.println("Hello World!!!!");
    }


    public static void main(String[] args) {
        accessModifiers am = new accessModifiers();
        System.out.println(am.i);
//        System.out.println(am.pi); //cannot access private property
        am.a();
//        am.pa();
        sample2 s2 = new sample2();
        s2.protectedMethod();
    }
}
/*
Access Modifiers are used with methods, variables & constructors.
private
default
protected
public
 */