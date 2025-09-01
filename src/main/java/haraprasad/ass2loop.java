package haraprasad;
//Find the sum of all number between 1 and 100 divisible by 3 and count the number.
public class ass2loop {
    public static void main(String[] args){
        int count=0,sum=0;
        for(int i=1;i<=100;i++){
            if(i%3==0){
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
//        for(int i=3;i<=100;i+=3){ //method 2
//            System.out.println(i);
//            sum+=i;
//            count++;
//        }
        System.out.println(sum);
        System.out.println(count);
    }
}
