package madhumitha;

public class ConditionalStatements {
    public static void main(String[] args) {
        int a=25;
        boolean votercard=false;
        char c='M';
        if(a>=18 && votercard==true && c=='F'){
            System.out.println("You are eligible to vote");
        }
        else if(a>=21 && votercard==true && c=='M'){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
