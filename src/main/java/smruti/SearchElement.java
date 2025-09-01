package smruti;

public class SearchElement {
    void lookelement(int[] x , int y ){
        int count =0;
        for (int i=0 ;i<x.length;i++ ){
            if (x[i]==y){
                count++;
            }
        }
        if (count>0){
            System.out.println(y+" count is "+count);
        }
        else{
            System.out.println("no common elements are found");
        }

    }
    public static void main(String[] args) {
        int[] s={1,3,6,4,3,-2,-2};
        int y=-2;
        SearchElement f = new SearchElement();
        f.lookelement (s,y);

    }
}

//   search the number inside the array and tell how many times that number is present  , take 2 parameters
//   if searching numbers are not present then print not present inside the array then  print its not present