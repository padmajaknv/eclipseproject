package Sangram;

public class Assignment10{
    public static void main(String[] args){
        int[] arr={7,2,0,5,8,8,6,3,7,0};
        int searchNumber=7;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==searchNumber){
                count++;
            }
        }
        if(count>0){
            System.out.println(searchNumber + "is present" + count + "time");
        }
        else{
            System.out.println(searchNumber + "is not present");
        }
    }
}
