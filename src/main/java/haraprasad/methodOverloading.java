package haraprasad;

public class methodOverloading {
    void sum(){
        System.out.println(1+2+3+4);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int[] a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        System.out.println(sum);
    }
    void sum(int a, float b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        methodOverloading x=new methodOverloading();
        int[] c={2,3};
        x.sum();
        x.sum(10,2);
        x.sum(c);
        x.sum(2,2.3f);
    }
}
