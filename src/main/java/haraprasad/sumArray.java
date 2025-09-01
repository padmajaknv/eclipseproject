package haraprasad;

public class sumArray {
    void sum(int[] a){
        int sum =0;
        if (a.length==0){
            System.out.println("There is no value to add.");
        }
        else{
            for (int i:a){
                sum =sum+i ;
            }
            System.out.println("sum is "+sum);
        }
    }

    public static void main(String[] args) {
        sumArray b = new sumArray();
        int[] x ={2,3,6,5};
        b.sum(x);
    }
}
