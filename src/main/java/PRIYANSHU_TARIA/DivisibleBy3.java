package PRIYANSHU_TARIA;

public class DivisibleBy3
{
    public static void main(String[] args)
    {
        int n = 100;
        int sum = 0;

        for (int i=1; i<=n;i++)
        {
            if (i%3==0)
            {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
