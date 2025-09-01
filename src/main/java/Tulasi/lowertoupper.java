package Tulasi;

import java.util.concurrent.atomic.AtomicInteger;

public class lowertoupper {

    public static void main(String[] args)
    {
        char ch='a';
        if((int)ch<=122 && (int)ch>=97){
            int n=ch-32;

            System.out.println((char)n);
        }
        else {
            System.out.println(ch);

        }

    }
}
