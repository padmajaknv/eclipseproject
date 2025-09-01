package padmaja.java;

public class Taskreturntype {
    void sum()
    {
        int sum=0;
        for(int i=2;i<=10;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;

            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Taskreturntype n=new Taskreturntype();
        n.sum();
    }
}
