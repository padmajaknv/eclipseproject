package smruti;

public class Multiarray {
    public static void main(String[] args) {
                int x =2;
                int y =2;
                int [][] c = new int [x][y];
                c[0][0] = 1;
                c[0][1] = 2;
                c[1][0] = 3;
                c[1][1] = 4;

                for (int i=0 ; i<x; i++){
                    for(int j = 0 ; j < y;j++){
                        System.out.print(c[i][j]+ " ");
                    }
                    System.out.println();
                }
    }
    //multi array

}