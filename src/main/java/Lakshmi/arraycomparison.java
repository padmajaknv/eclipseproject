package Lakshmi;

public class arraycomparison {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5,9,7};
       int count =0;
       int k=0;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if (arr1[i] == arr2[j]){
               count++;
                }
            }
        }
        int[]c=new int [count];
        System.out.println(count);
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    c[k]=arr1[i];
                    k++;
                    System.out.println("total matching elements:"+count);
                }

            }
        }



    }

    }


