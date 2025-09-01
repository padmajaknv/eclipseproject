package padmaja.java;

public class lenthofstr {
    int len(String s){
        int x=s.length();
        if(x%2==0)
        {
            System.out.println("Even");
        }
        else {

            System.out.println("Odd");;
        }
        return x;
    }
    public static void main(String[] args) {
        lenthofstr l=new lenthofstr();
        int i=l.len("padmaja");
        System.out.println(i);

    }
}
