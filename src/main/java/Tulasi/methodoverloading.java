package Tulasi;

public class methodoverloading
{
    void method1()
{
    System.out.println("method1 with no parameters output");
}
   void method1(int a,int b)
   {
       System.out.println(a+b);

   }
   void method1(float a,int b)
   {
       System.out.println(a+b);
   }


    public static void main(String[] args)
    {
        methodoverloading obj=new methodoverloading();
        obj.method1();
        obj.method1(1,2);
        obj.method1(1.5f,3);

    }
}
