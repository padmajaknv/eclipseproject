package Tulasi;

public class task2 {
    void countoflowercase(String s1){
        String str=s1;
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)

        {


            if(ch[i]>=97 && ch[i]<=122){
               count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

        String s="Java PRaCTice";
        task2 obj=new task2();
        obj.countoflowercase(s);

    }
}
