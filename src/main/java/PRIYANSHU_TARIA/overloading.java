package PRIYANSHU_TARIA;

// multiple method of same name different parameter

public class overloading
{
    void load(int x)
    {
        System.out.print("sum is : " + (x));
        System.out.println();
    }
    void load(int x,int y)
    {
        System.out.print("sum is : " + (x+y));
        System.out.println();
    }
    void load(int a,float b)
    {
        System.out.print("sum is : " + (a+b));
    }

    // multiple method of same name different parameter
    public static void main(String[] args)
    {
        overloading over = new overloading();
        over.load(40);
        over.load(40,20);
        over.load(40,20.2f);
    }
}
