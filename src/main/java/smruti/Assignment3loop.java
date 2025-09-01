package smruti;/* find the total numbers , count the total numbers  and sum of all those numbers  of all the numbers that are divisible by 3
 range 1 - 100 */

public class Assignment3loop {
    public static void main(String[] args) {
        int count =0;
        int  s = 0 ;
        for (int i =3 ; i<=100 ; i=i+3){
            System.out.println(i);
            s +=i;
            count++;


        }
        System.out.println("count is " +count);
        System.out.println("sum is " +s);

    }
}



