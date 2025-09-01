package PRIYANSHU_TARIA;

public class sumevenvoid
{
    void even(int x)
    {
        System.out.print("Sum of Even no is " + x);
    }
    public static void main(String[] args)
    {
        int n = 10;
        int sum = 0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        sumevenvoid summ = new sumevenvoid();
        summ.even(sum);
    }
}


/*

        USING RETURN TYPE

 int summ(int evensum)
    {
        System.out.print("Even sum is : ");
        return evensum;
    }
    public static void main(String[] args)
    {
        sumofevenReturn even = new sumofevenReturn();
        int n = 10;
        int sum =0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
               sum+=i;
            }
        }
        int x = even.summ(sum);
        System.out.println(sum);
    }

 */