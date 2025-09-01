package Vivek;

public class searchelementinarray {
    int count=0;
    void a(int y[],int b){
        for(int i=0;i<y.length;i++){
            if(y[i]==b){
                System.out.println(b);
                count++;
            }
        }
    }
    public static void main(String[] args) {
        searchelementinarray m = new searchelementinarray();
       int[] y={1,2,3,4,5};
       int b=5;
       m.a(y,b);
    }
}
