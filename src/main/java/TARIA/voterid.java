package TARIA;

public class voterid
{
    public static void main(String[] args)
    {
        int age=21;
        boolean voterid=true;
        if(age>=21 && (voterid==true))
        {
            System.out.println("male & female both are eligible for vote");
        }

        else if(age>=18 && (voterid==true))
        {
            System.out.println("female are eligible for vote");
        }

        else
        {
            System.out.println("No one is eligible for vote");
        }
    }
}
