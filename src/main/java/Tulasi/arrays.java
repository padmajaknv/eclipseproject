package Tulasi;

public class arrays
{
    public static void main(String[] args){

        int[] arr1={1,4,5,3,8};
        int[] arr2={4,5,6,9,0,3};
        int size=0;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    size++;

                }

            }

        }
        int[] arr3 = new int[size];

        int index=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3[index]=arr1[i];
                    System.out.println(arr3[index]);
                    index++;
                    continue;
                }

            }

        }



    }


}
