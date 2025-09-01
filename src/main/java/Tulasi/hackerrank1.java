package Tulasi;

import java.util.Scanner;

public class hackerrank1
{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);


            int N = scanner.nextInt();
            if(N%2!=0 || (N>=6 && N<=20))
            {
                System.out.println("Weird");

            }
            else
            {
                System.out.println("Not Weird");
            }


}}



