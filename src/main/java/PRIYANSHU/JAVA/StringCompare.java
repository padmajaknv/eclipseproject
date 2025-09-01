package PRIYANSHU.JAVA;
//compare 2 string and check weather both are identical or not?

public class StringCompare
{
    public static void main(String[] args)
    {
        String s = "abcmno";
        String ss = "abcmno";
        if(s.equals(ss))
        {
            System.out.println("identical");
        }
        else
        {
            System.out.println("Not identical");
        }
    }

}
/*
 String s = "abcmno";
        String ss = "abcmno";
        if(s==ss)
        {
            System.out.println("identical");
        }
        else
        {
            System.out.println("Not identical");
        }
 */