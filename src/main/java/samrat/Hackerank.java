package samrat;

public class Hackerank {
    public static void main(String[] args) {
        int n = 24;
        if (n %2 == 1) {
            System.out.println("Weird");
        }
        else if (n>=2 && n<=5){
            System.out.println("Not Weird");
        }
        else if (n>=6 && n<=20){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
    }
}

