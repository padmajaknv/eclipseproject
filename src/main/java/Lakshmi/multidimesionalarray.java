package Lakshmi;

public class multidimesionalarray {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {9, 8, 7}};
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println( );
        }
        //System.out.println( );


    }
}
