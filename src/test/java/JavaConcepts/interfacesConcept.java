package JavaConcepts;


interface sampleInterface{
    public static final int i = 5;
    //all the interface variables are public static final


    public abstract void x();
    //all the methods in an interface are public abstract by definition
}

interface anotherInterface{
    int j = 6;
}

interface interface2 extends sampleInterface, anotherInterface{}

public class interfacesConcept implements sampleInterface, anotherInterface{ //Multiple inheritance
    public void x(){
        System.out.println("Void x");
    }

    public static void main(String[] args) {
//        sampleInterface si = new sampleInterface();
        System.out.println(sampleInterface.i);
        interfacesConcept ic = new interfacesConcept();
        ic.x();
        System.out.println(anotherInterface.j);
    }
}

/*
class extends class
interface extends interface
class implements interface
 */