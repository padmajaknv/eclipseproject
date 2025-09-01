package Sangram;

public class dataTypes {
    public static void main(String[] args){
        /*
        Primitive: Integers, Decimals, Characters & Boolean.
        Non-Primitive: Arrays, Class, Strings & Interface.

        Integers:
        byte: Size of byte is 2 power 8.
        Range is -128 to -1 & 0 to 127.

        short: Size of short is 2 power 16.
        Range is -32768 to -1 & 0 to 32767.

        int: Size of int is 2 power 32.
        long: Size of long is 2 power 64.

        Decimals:
        float : Size is 2 power 32.
        double: Size is 2 power 64.

        Boolean: true or false

        Characters:
        char: Single letter & single quotes
        Size of char is 2 power 16.
         */
        //dataType variableName = value;
        byte a = 15; //Declaration & Initialisation
        //byte a -> Declaration
        short b; //Declaration
        b=1000; //Initialisation
        b=100; //Updating
        int c = 10000;
        long d = 1346234;

        float x = 3.2345734f;
        double y = 0.345632;

        boolean z = true;
        boolean zz = false;

        char ch = 'a';
        char ch1 = '9';
        char ch2 = 122;
        int ch3 = 'a';
        System.out.println(x);
        System.out.println(a+1);
        System.out.println(a+b);
        System.out.println('a');
        System.out.println('a'+'b');
        System.out.println('a'+b);
        System.out.println("a"+b);
        System.out.println(ch2+ch3);
    }
}

