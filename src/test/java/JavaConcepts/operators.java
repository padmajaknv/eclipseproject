package JavaConcepts;

public class operators {
    public static void main(String[] args){
        int a=2,b=3,c=4,d=5;
        float x = 2f;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(d-c));
        System.out.println("Multiply: "+(a*b));
        System.out.println("Divide: "+(b/a));
        System.out.println(b/x);
        System.out.println("Modulus: "+(d%a));
        /*
        a++ or ++a or a=a+1 or a+=1
        a= a+2 or a+=2

        a-- or --a or a=a-1 or a-=1
        a=a-2 or a-=2

        a= a*2 or a*=2

        a=a/2 or a/=2
         */
        //a++ post increment
        //++a pre increment
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);

        System.out.println("Answer " +  (a+++b+c+d));
        System.out.println("Answer1 " +  (a+b+c+d));
        /*
        Relational Operators: >,<.>=,<=,==,!=,!
        "==" Equality Operator. Should be used only for Primitives.
        "=" Assignment Operator
         */
        boolean y = a>b;
        System.out.println(y);

        /*
        Logical Operators: &&, ||
         */
        boolean z = (a<b) && (c>d);
        System.out.println(z);

        a=b;
        System.out.println(a);
    }
}
