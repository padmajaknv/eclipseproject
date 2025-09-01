package PRIYANSHU.MOCK_TEST;

public class StringNumberCount
{
    public static void main(String[] args)
    {
        String s = "abc123def456";
        String N = s.replaceAll("abc","").replaceAll("def","");
        System.out.println("Total no. presesnt is : " + N.length());
    }
}
