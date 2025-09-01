package JyothiPrakash;
public class div3 {

    public static void main(String[] args)
    {
        int sum=0;
        int count=0;
      for (int i=3;i<=100;i++)
      {
          if(i%3==0)
          {
              System.out.println(i);
              sum=sum+i;
              count++;
          }
      }
        System.out.println(sum);
        System.out.println(count);
    }

}
