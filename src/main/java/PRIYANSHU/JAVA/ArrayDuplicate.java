package PRIYANSHU.JAVA;

public class ArrayDuplicate
{
    public static void main(String[] args)

    {
        System.out.println("Duplicate Element are : ");
        int[] a = {1,2,3,4,5,5,6,6,6,7,7,7};
        int m = a.length;
        int temp = 1;
        int index = 0;

        for(int i=0;i<=m-1;i++)
        {
            int count = 1;
            if(a[i]!=-1) {
                for (int j = i + 1; j <= m - 1; j++)
                {
                    if (a[i] == a[j])
                    {
                        count = count + 1;
                        a[j] = -1;
                    }
                }

                if (count >= temp)
                {
                    temp = count;
                    index = a[i];
                    System.out.println(index + "----------->" + temp);
                }

            }
        }
    }

}
