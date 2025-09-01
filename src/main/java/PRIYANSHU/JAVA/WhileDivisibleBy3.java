package PRIYANSHU.JAVA;
// wap to find number divisible by 3 using while loop
public class WhileDivisibleBy3
{
    public static void main(String[] args)
    {
        int i=30;
        while(i>3)
        {
            if(i%3==0)
            {
                System.out.println(i);
            }
            i--;
        }
    }

}
