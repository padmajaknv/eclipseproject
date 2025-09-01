package PRIYANSHU_TARIA;

/*
1.create multidimension array and insert values into . then retrive all values uing for loop.
 */
public class MultidimensionalArray
{
    public static void main(String[] args)
    {
        int x=3;
        int y=3;
        int[][] arr = new int[x][y];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
OR

    public static void main(String[] args)
            {
                int[][] arr ={ {1,2,3},
                               {4,5,6},
                               {7,8,9} };
                int x=arr.length;

                for(int i=0;i<x;i++)
                {
                    for(int j=0;j<x;j++)
                    {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
 */
