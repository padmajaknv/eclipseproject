package Bhanukrishna07;

public class ArrayandNaturalsum {
    void printArray(int [] x) {
        System.out.println("even places values");
        for(int i:x){
            if(i%2==0){
                System.out.println(i);
            }
       // for (int i = 0; i <= x.; i= i + 2) {
        }
    }
    void sumNutural(int x){
        int sum=0;
        for(int i=0;i<=x;i++){
            sum=i*(i+1)/2;
        }
        System.out.println("Sum of naturalnumbers:"+sum);
    }
        public static void main(String[] args){
            ArrayandNaturalsum ar=new ArrayandNaturalsum();
         int [] x={8,6,7,3,4};
         ar.printArray(x);
         ar.sumNutural(40);
    }







}
