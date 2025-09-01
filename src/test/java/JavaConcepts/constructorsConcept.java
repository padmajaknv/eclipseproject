package JavaConcepts;

public class constructorsConcept {
    /*
    Constructor is a piece of code which executes when an object is created.

    Constructor's name is same as the name of the class in which it is created.

    Constructor is similar to a method but does not have any return type or void.
     */


    constructorsConcept(){
        System.out.println("Basic Constructor");
    }

    public static void main(String[] args) {
        constructorsConcept cc = new constructorsConcept();
    }


}
