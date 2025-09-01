package Vivek;

public class Array1 {


        public static void main(String[] args) {

            int[][] a = new int[2][2];
            a[0][0] = 9;
            a[0][1] = 10;
            a[1][0] = 11;
            a[1][1] = 12;

            for (int i = 0; i < 2; i++) {

                for (int j = 0; j < 2; j++) {

                    System.out.print(a[i][j] );
                }

                System.out.println();
            }
        }
}
