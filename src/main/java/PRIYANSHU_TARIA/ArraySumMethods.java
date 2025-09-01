package PRIYANSHU_TARIA;

/*
    using method wap to display sum of all element present in an array
 */

public class ArraySumMethods
{
    void arraysum(int n, int[] arr)
    {
        int sum=0;
        System.out.print("Sum Of Array Element is : ");
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        ArraySumMethods array = new ArraySumMethods();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        array.arraysum(n,arr);
    }
}
