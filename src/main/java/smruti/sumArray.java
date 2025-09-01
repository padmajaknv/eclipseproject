package smruti;

public class sumArray {
    void sumArreyelements(int[] x){
        int sum =0;
        if (x.length==0){
            System.out.println("there is no value to add ! ");
        }
        else{
            for (int i:x){
                sum =sum+i ;
            }
            System.out.println("sum is "+sum);
        }

    }
    public static void main(String[] args) {
        sumArray f = new sumArray();
        int[] x ={1,2,3,4,-2,9,2};
        f.sumArreyelements(x);

    }
}


//  print  the sum of the  elements of array