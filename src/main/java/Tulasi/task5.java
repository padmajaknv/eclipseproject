package Tulasi;

public class task5 {
    void converttoupper(String s1)
    {
        String str=s1;
        char[] ch=str.toCharArray();
        for(int i=0;i< ch.length;i++)
        {
           if(ch[i]>=97 && ch[i]<=122)
           {
               ch[i]= (char) (ch[i]-32);
           }
           else
           {

               ch[i]=ch[i];

           }
        }
        System.out.println(String.valueOf(ch));
    }
    void converttolower(String s1)
    {
        String str=s1;
        char[] ch=str.toCharArray();
        for(int i=0;i< ch.length;i++)
        {
            if(ch[i]>=48 && ch[i]<=57)
            {
                ch[i]= (char) (ch[i]+32);
            }
            else
            {

                ch[i]=ch[i];

            }
        }
        System.out.println(String.valueOf(ch));
    }
    public static void main(String[] args)
    {
        task5 obj=new task5();
        String str="Java practice";
        obj.converttoupper(str);
        obj.converttolower(str);

    }
}
