package Vivek;

public class sumelementsinarray {

    void a(int y[]){
        int sum=0;
        for(int i=0;i<y.length;i++)
        {
            sum=sum+y[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumelementsinarray m = new sumelementsinarray();
        int[] y={1,2,3,4,5};
        m.a(y);
    }
}
