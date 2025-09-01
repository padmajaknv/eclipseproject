package ramya;

public class LoopAssignment {
    public static void main (String[] args){
        int sum = 0;
        int Count=0;
        for (int k=1; k<=100; k++) {
            if (k % 3 == 0) {
                sum = sum + k;
                Count = Count + 1;
            }
            System.out.println(k);
        }

            System.out.println(sum);
            System.out.println("count is;"+ Count);


    }
}
