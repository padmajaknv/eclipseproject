package PRIYANSHU.JAVA;

public class EvenIndexArray
{
    void even(int n,int[] arr)
    {
        System.out.print("Even number are : ");
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        EvenIndexArray even = new EvenIndexArray();
        int[] arr={2,3,4,5,6,7,8};
        int n=arr.length;
        even.even(n,arr);
    }

}
/*

OR

 void even(int[] arr)
    {
        System.out.print("Even number are : ");
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        EvenIndexArray even = new EvenIndexArray();
        int[] arr={2,3,4,5,6,7,8};
        //int n=arr.length;
        even.even(arr);
    }

 */
