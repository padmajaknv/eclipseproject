package smruti;

import java.util.Scanner;

public class HR_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        System.out.print("Enter a number: ");
        int n = sc.nextInt();  // Read user input
        int m = n % 2;

        if (m == 1) {
            System.out.println("weird");
        } else if (m == 0 && n >= 2 && n <= 5) {
            System.out.println("not weird");
        } else if (m == 0 && n >= 6 && n <= 20) {
            System.out.println("weird");
        } else {
            System.out.println("not weird");
        }

        sc.close();  // Close scanner
    }
}



//If n is odd, print Weird
//If n is even and in the inclusive range of 2 to 5 print Not Weird
//If n is even and in the inclusive range of 6 to 20 print Weird
//If n is even and greater than 20 print Not Weird