package JavaConcepts;

import java.util.Scanner;

public class scannerConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next(); //captures input till the first whitespace
//        System.out.println(s);
//        String s = sc.nextLine(); //captures the entire line
//        System.out.println(s);
        int i= sc.nextInt();
        System.out.println(i+10);
    }
}
