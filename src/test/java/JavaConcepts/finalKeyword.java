package JavaConcepts;


final class example6{}


class example5{
    void a(){
        System.out.println("Void a");
    }

    final void b(){
        System.out.println("void b");
    }

//    final abstract c();
}

public class finalKeyword extends example5{
    int x = 5;
    final int y=6;

    void a(){
        System.out.println("Overriding");
    }

//    void b(){}

    public static void main(String[] args) {
        finalKeyword fk = new finalKeyword();
        System.out.println(fk.x);
        fk.x++;
        System.out.println(fk.x);
        System.out.println(fk.y);
//        fk.y++;
        fk.b();
    }
}

/*
final keyword is used for variables, methods & classes.

final variables are constants.
final methods cannot be overridden.
final classes cannot be inherited.
 */