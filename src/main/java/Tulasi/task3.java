package Tulasi;

public class task3 {
    void countofnumerics(String s1){
        String str=s1;
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)

        {


            if(ch[i]>=48 && ch[i]<=57){
               count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {

        String s="15Java 907PRaCTice";
        task3 obj=new task3();
        obj.countofnumerics(s);

    }
}
