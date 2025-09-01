package PRIYANSHU.JAVA;

public class ReverseStringManually
{
    public static void main(String[] args)
    {
        String s = "Quality Thought";
        int n = s.length();
        String reverse = "";
        for(int i=n-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            reverse = reverse + ch ;
        }
        System.out.println("Reverse number is : " + reverse);
    }

}
