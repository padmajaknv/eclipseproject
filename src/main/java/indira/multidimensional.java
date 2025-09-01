package indira;

public class multidimensional {
    public static void main(String[] args){
        int[][] c= new int[2][2];
        c[0][0]=4;
        c[0][1]=5;
        c[1][0]=6;
        c[1][1]=7;
        int cLength = c.length;
        System.out.println("size of the array:" +cLength);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+"   ");
            }
            System.out.println(" ");//print the output
        }

    }
}


