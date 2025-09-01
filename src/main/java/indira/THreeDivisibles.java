package indira;

public class THreeDivisibles {

        public static void main(String[]args){
            int count=0,sum=0;
            for(int i=3;i<=100;i=i+3){

                System.out.println("The number is "+ i);
                count++;
                sum=sum+i;
            }

            System.out.println("Total count is " + count++);
            System.out.println("Total sum is " + sum);

        }
    }

