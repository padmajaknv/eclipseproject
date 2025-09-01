package Tulasi;

public class vowelscount
{
    void vowels(String str)
    {
        String str1=str.toLowerCase();
        int count=0;
        for(int i=0;i< str1.length();i++)
        {
            System.out.println(str1.charAt(i));
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
            {
                count++;
            }

        }
        System.out.println(count);


    }





    public static void main(String[] args)
    {
        vowelscount obj=new vowelscount();
        String str="Java Practice";

        obj.vowels(str);

    }
}
