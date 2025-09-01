package JavaConcepts;

public class whileDoWhile {
    public static void main(String[] args){
        int i=0,k=0;
        while(i<5){//can also be used when we are not sure about the no. of iterations
            System.out.println(i);
            i++;
        }
        System.out.println("================");
        int j=30;
        while(j>0){
            if(j%3==0){
                System.out.println(j);
            }
            j--;
        }
        System.out.println("=================");
        for(int x=0;x>0;x++){
            System.out.println("For loop");
        }
        do{
            //loop code
            System.out.println("Do While loop");
            k--;
        }while (k>0);
    }
}
