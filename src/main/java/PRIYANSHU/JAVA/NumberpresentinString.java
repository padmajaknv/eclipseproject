package PRIYANSHU.JAVA;
////	6.WAP to check weather a number is present in the String or not.

public class NumberpresentinString
{
    public static void main(String[] args)
    {
        String s = "priyans7327#$";
        String alphabet = "";
        int count = 0;
        String nascii = "";
        int n = s.length();

        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90)
            {
                alphabet+=ch;
            }
            else if(ascii>=97 && ascii<=122)
            {
                alphabet+=ch;
            }
            else if(ascii>=48 && ascii<=57)
            {
                count++;
                nascii = nascii + ch;
            }
        }
        System.out.println("Total Number present in String is : " + count);
        System.out.println("charcater are : " + nascii);
    }


}
