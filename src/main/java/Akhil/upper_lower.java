package Akhil;

public class upper_lower {public static void main(String[] args) {
    System.out.println("lowercase to uppercase");
    char [] c={'s','g','h','u','p'};
    for(int i=0;i<c.length;i++){
        if(c[i]>='a' && c[i]<='z'){
            c[i]=(char) (c[i]-32);
//                c[i] = c[i]-32;
            //char c = (char)x;
        }
    }
    for(char a:c){
        System.out.print(a+" ");
    }

    System.out.println();
    System.out.println("============");
    char [] a={'G','R','E','O','V'};
    for(int i=0;i<a.length;i++){
        if(a[i]>='A'&&a[i]<='Z'){
            a[i]=(char)(a[i]+32);
        }
    }
    System.out.println("uppercase to lowercase");
    for(char b:a){
        System.out.print(b+" ");
    }

}
}
