package JavaConcepts;

public class variableScope {
    int x = 2; //instance variable
    static int s = 5; //static variable

    public static void main(String[] args){
        int z = 5; //local variable. Local to main method
        //className objectName = new className();
        variableScope vs = new variableScope();
        System.out.println(vs.x); //accessing the instance variables
        System.out.println(vs.y);
        vs.x++;
        System.out.println("After Update: "+vs.x);
        variableScope vs1 = new variableScope();
        System.out.println(vs1.x);
        vs1.x++;
        System.out.println("After update for vs1: "+vs1.x);
        variableScope vs2 = new variableScope();
        System.out.println(vs2.x);
//        System.out.println(i);
        int i=6;
        if(z>0){
//            int i =6; //local variable. local to 'if' block
            System.out.println(i);
        }
        System.out.println(z);
        System.out.println(i);
        System.out.println(variableScope.s);//accessing static variables
        variableScope.s++;
        System.out.println(variableScope.s);
        System.out.println(variableScope.s);
        System.out.println(variableScope.s);
        System.out.println(variableScope.s);
        System.out.println(variableScope.s);
    }
    int y = 3;//instance variable

}

/*
Based on the place of declaration, we have:

Instance Variable:
Declared inside the class but not inside any method (not even main method),
loop, condition or block. Can be accessed only with an Object.

Local Variable:
Declared inside the class and inside either a method (can be even main method),
loop, condition or block. No object is needed to access it.

Static Variable:
Declared just like instance variable but along with the keyword "static".
No object is needed to access it.
 */
