package Tulasi;

public class task4 {
    void reverse(String s1)
    {
        String str=s1;
        char[] ch=str.toCharArray();
        char[] ch1=new char[ch.length];
        int j=0;
        for(int i=ch.length-1;i>=0;i--)
        {
            ch1[j]=ch[i];
            j++;

        }
        String strreverse=String.valueOf(ch1);
        System.out.println(strreverse);
    }
    public static void main(String[] args) {
        task4 obj=new task4();

        String str="Java practice";
        obj.reverse(str);

    }
}
