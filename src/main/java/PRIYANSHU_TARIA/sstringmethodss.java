package PRIYANSHU_TARIA;

public class sstringmethodss
{
    /*
    even odd
    3.create a method to calculate length of the string and
		check the length is even or odd
     */

    int length(int x)
    {
        System.out.print("Length is ");
        return x;
    }
    int evenodd(int y)
    {
        // System.out.println();
        System.out.print("Length is ");
        return y;
    }

    public static void main(String[] args)
    {
        String str = "PRIYANSHU TARIA";
        sstringmethodss sm = new sstringmethodss();
        int len = str.length();

        int strr = sm.length(len);
        System.out.println(strr);

        int eo = sm.evenodd(len);
        System.out.println(eo);

    }
}