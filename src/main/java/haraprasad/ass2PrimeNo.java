package haraprasad;
//Count all the Prime no between 1-100 and calculate the sum of it
public class ass2PrimeNo {
    public static void main(String[] args){
        int count =0,sum=0;
        for(int i=1;i<=100;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                count++;
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of Prime Number: "+sum);
        System.out.println("Total number of prime between 1 to 100: "+count);
    }
}
