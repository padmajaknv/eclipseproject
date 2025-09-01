package PRIYANSHU_TARIA;

public class ArrayDuplicate
{
    void Duplicate(int n , int[] arr)
    {
        System.out.print("Duplicate Element are : ");
        for (int i=0; i<n-1;i++)
        {
            for (int j=i+1; j<n; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9};
        int n = arr.length;
        ArrayDuplicate array = new ArrayDuplicate();
        array.Duplicate(n,arr);


    }
}

/*



 */