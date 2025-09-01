package padmaja.java;

public class task2hackerrank {

    public static void main(String[] args) {
        int n=3;
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if((n%2==0) && ((n>=2) && (n<=5))){
            System.out.println("Not Weird");
        }
        else if((n%2==0) && ((n>=6) && (n<=20))){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not weird");
        }
    }
}
