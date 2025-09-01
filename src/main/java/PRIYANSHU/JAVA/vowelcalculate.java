package PRIYANSHU.JAVA;

/*
    WAP to create a method to calculate number of vowel present is string.
					vowel may be uppercase or lowercase
 */
public class vowelcalculate
{
    void countvowel(String ss)
    {
        int n = ss.length();
        String vowel = "";
        int count = 0;
        for(int i=0;i<n;i++)
        {
            char ch = ss.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                count++;
                vowel = vowel + ch;
            }
        }
        System.out.println("vowel are : " + vowel);
        System.out.println("Total No. of Vowel are : " + count);

    }
    public static void main(String[] args)
    {
        String s = "priyanshu";
        vowelcalculate vc = new vowelcalculate();
        vc.countvowel(s);
    }

}
