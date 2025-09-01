package Tulasi;

public class task1 {
    void countofuppercase(String s1){
        String str=s1;
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)

        {


            if(ch[i]>=65 && ch[i]<=90){
               count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

        String s="Java PRaCTice";
        task1 obj=new task1();
        obj.countofuppercase(s);

    }
}
