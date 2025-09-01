package Tulasi;

public class forloop {

    public static void main(String[] args){
        int sum=0;
        int count=0;
             for(int i=1;i<=100;i++)
                {
                  if(i%3==0)
                  {
                      sum=sum+i;
                      count++;
                  }
                }
        System.out.println("sum=" + sum + "and" + "count=" + count);

    }
}
