package TARIA;

public class HackerRank
{
    public static void main(String[] args)
    {
        int n=16;

        if(n%2!=0)
        {
            System.out.println("Weird");
        }

        if((n%2==0) && (2<n) && (n<5))
        {
            System.out.println("Not Weird");
        }

        if((n%2==0) && (6<n) && (n<20))
        {
            System.out.println("Not Weird");
        }

        if((n%2==0) && (n>20))
        {
            System.out.println("Not Weird");
        }

    }

}
