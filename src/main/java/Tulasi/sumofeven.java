package Tulasi;

public class sumofeven {
    void sum()
    {
        int sum=0;
       for(int i=0;i<=20;i=i+2)
       {
          sum= sum+i;
       }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
      sumofeven a=new sumofeven();
      a.sum();
    }
}
