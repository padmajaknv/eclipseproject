package priyanka;

public class votercardeligiblity {
    public static void main(String[] args){
        int f=18;
        int m=25;
        boolean votercard=true;
        if((votercard==true)&&(f>=18)){
            System.out.println("women eligible for voting");
        }
        if ((votercard==true)&&(m>=21)){
            System.out.println("men eligible for voting");
        }
        else {
            System.out.println("not eligible for voting");
        }

    }
}
