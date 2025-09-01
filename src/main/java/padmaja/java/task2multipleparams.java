package padmaja.java;

public class task2multipleparams {
    void xyz(int a)
    {
        System.out.println(a);
    }
    void xyz(int b,float d)
    {
        System.out.println(b+d);
    }
    int xyz()
    {
        return 3;

    }
    float xyz(float x)
    {
        return x+5;
    }

    public static void main(String[] args) {
        task2multipleparams n=new task2multipleparams();
        n.xyz(3);
        n.xyz(4,1.2f);
        int k=n.xyz();
        System.out.println(k);
        float z=n.xyz(4.2f);
        System.out.println(z);
    }
}
