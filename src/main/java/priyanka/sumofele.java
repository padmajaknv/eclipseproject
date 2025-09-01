package priyanka;

public class sumofele {
    void a(int[] num)
    {
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        sumofele s=new sumofele();
        int[] num={1,2,3,4,5};
        s.a(num);
    }
}