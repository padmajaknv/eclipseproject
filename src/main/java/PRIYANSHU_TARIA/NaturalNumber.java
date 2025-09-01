package PRIYANSHU_TARIA;

public class NaturalNumber
{
    void m1(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("sum of 1st 100 natural no. is : " + sum);
    }
    public static void main(String[] args)
    {
        NaturalNumber nn = new NaturalNumber();
        nn.m1(100);
    }
}

/*

// METHOD - 2

 void m1(int n)
    {
      int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum = n*(n+1)/2;
        }
        System.out.println("sum of 1st 100 natural no. is : " + sum);
    }
    public static void main(String[] args)
    {
        NaturalNumber2 nn = new NaturalNumber2();
        nn.m1(100);
    }
 */