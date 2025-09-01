package PRIYANSHU.JAVA;

public class VoterIdCard
{
    public static void main(String[] args)
    {
        int age = 19;
        char gender = 'f'; // 'm' for male, 'f' for female
        // we have to specify here ;
        // userinput will be based on user
        boolean voterid = true;

        if (gender == 'm' && age >= 21 && voterid)
        {
            System.out.println("Male is eligible for vote.");
        }
            else if (gender == 'f' && age >= 18 && voterid)
            {
                System.out.println("Female is eligible for vote.");
            }
                else
                {
                    System.out.println("Not eligible for vote.");
                }
    }
}


