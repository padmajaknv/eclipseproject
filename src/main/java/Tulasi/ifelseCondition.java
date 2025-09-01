package Tulasi;

import java.util.Scanner;

public class ifelseCondition {

    public static void main(String[] args)
    {


        Scanner age= new Scanner(System.in);
        int n = age.nextInt();
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        Scanner votercard=new Scanner(System.in);
        boolean vc=votercard.nextBoolean();
        if(vc==true)
        {
            if((c=='m'&&n>=21) || (c=='f'&& n>=18))
            {
                System.out.println("eligible to vote");
            }
            else
            {
                System.out.println("not eligible to vote");
            }
        }
        else
        {
            System.out.println("not eligible to vote");
        }




    }
}
