package VarshithaUppalapati;

public class even1to10 {
    void a(){
        int sum=0;
        for(int i=0;i<=10;i+=2){
            sum=sum+i;
        }
        System.out.println("no.of even: "+sum);

    }
    public static void main(String[] args) {
        even1to10 ev=new even1to10();
        ev.a();
    }
}