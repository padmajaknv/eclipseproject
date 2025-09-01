package JavaConcepts;

public class methodOverloading {

    void a(){
        System.out.println("void a");
    }

    void a(int x){
        System.out.println(x+2);
    }

    void a(float y){
        System.out.println(y);
    }

    int a(int x, int y){
        return x+y;
    }

    static void a(char c){
        System.out.println("Static void a");
    }

//    void a(char c){
//        System.out.println(c);
//    }

    public static void main(String[] args) {
        methodOverloading mo = new methodOverloading();
        mo.a();
        mo.a(1,2);
        mo.a(1.2f);
        methodOverloading.a('c');
    }

}


/*
Creating multiple methods of the same name but with different
parameters inside the same class is called as Method Overloading.
 */
