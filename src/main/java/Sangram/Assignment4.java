package Sangram;

public class Assignment4 {
    public static void main(String[] args){
        int count=0;
        int sum=0;
        int j;
        for(int i=2;i<=100;i++)
        {
            for(j=2;j<=i;j++)
            {
                if (i%j == 0) {
                    break;
                }
            }
            if(i==j)
            {
                System.out.println(i);
                count++;
                sum=sum+i;
            }
        }
        System.out.println("count is:"+count);
        System.out.println("sum is:"+sum);
    }
}