package JavaConcepts;

public class variableParams {
    int[] a(int... i){
        System.out.println(i.length);
        for(int x=0;x<i.length;x++){
            System.out.println(i[x]);
        }
        return i;
    }

    public static void main(String[] args) {
        variableParams vp = new variableParams();
        vp.a(1,2,3,4,5,6,7,8,9,0);
    }
}
