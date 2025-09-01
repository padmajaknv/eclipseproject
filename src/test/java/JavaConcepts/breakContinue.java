package JavaConcepts;

public class breakContinue {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            System.out.println(i);
            if(i==9){
                System.out.println("Execute Break");
                break;//exits the loop
            }
        }
        System.out.println("================");
        for(int i=0;i<10;i++){
            if(i==5){
                continue;//skips the particular iteration
            }
            System.out.println(i);
        }
    }
}

