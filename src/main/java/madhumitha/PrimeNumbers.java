package madhumitha;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        int c,count=0,a=0;
       for(int i=1;i<=100;i++)
       {
           c=0;
           for(int j=2;j<=i/2;j++)
           {
               if(i%j==0)
               {
                   c++;
                   break;
               }
           }
                if(c==0 && i!=1)
           {
                    System.out.println(i+"");
                    count++;
                    a=count+a;
           }
       }
        System.out.println("Count is:"+count);
        System.out.println("sum of All Primes b/w 1 to 100 is:" +a);
    }
}
