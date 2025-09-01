package PRIYANSHU.JAVA;

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
