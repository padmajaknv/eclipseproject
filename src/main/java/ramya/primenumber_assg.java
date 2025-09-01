package ramya;

public class primenumber_assg {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        int i,j;
        for ( i = 1; i <= 100; i++)
        {
            for ( j = 2; j<=i; j++)
            {
                if (i%j==0)
                {
                    break;
                }

            }
            if(i==j)
            {
                System.out.print(i+" ");
                count=count+1;
                sum=sum+i;

            }
        }

System.out.println("sum of prime numbers is"+sum);
        System.out.println("count is:"+count);
    }
}