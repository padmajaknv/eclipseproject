package PRIYANSHU.JAVA;

/*  5.WAP to take a string and find out uppercase letter & Lowercase Letter
	in that string using Methods.
*/

public class upperlowercase
{
    void upperlower(String ss)
    {
        String uppercase = "";
        String lowercase = "";
        int n = ss.length();

        for(int i=0;i<n;i++)
        {
            char ch = ss.charAt(i);
            int ascii = (int)ch;

            if(ascii>=65 && ascii<=90)
            {
                //uppercase = uppercase + (char)ascii;
                uppercase = uppercase + ch;
            }
            else if(ascii>=97 && ascii<=122)
            {
                //lowercase = lowercase + (char)ascii;
                lowercase = lowercase + ch;
            }

        }
        System.out.println("Uppercase are : " + uppercase);
        System.out.println("Lowercase are : " + lowercase);
    }
    public static void main(String[] args)
    {
        String s = "PrIyansHu";
        upperlowercase uclc = new upperlowercase();
        uclc.upperlower(s);
    }

}
