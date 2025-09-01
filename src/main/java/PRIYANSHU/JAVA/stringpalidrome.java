package PRIYANSHU.JAVA;
// 	3.WAP to check weather a string is palindrome or not . ( mom or dad )

public class stringpalidrome
{
    public static void main(String[] args)
    {
        String s = "moom";
        String p = s;
        int n = s.length();
        String reverse = "";

        for(int i=n-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println("Reverse is : " + reverse);

        if(reverse.equals(p))
        {
            System.out.println("String is palindrome.");
        }
        else
        {
            System.out.println("String is not palindrome.");
        }
    }

}
