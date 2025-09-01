package haraprasad;

public class ass1voting {
    public static void main(String[] args){
        int age=26;
        char p= 'm';
        boolean votercard = true;
        if(votercard==true && age>=21 && (p=='m' || p=='M')){
            System.out.println("Men eligible");
        }
        else if(votercard==true && age>=18 && (p=='f' || p=='F')){
            System.out.println("Women eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
