package samrat;

public class paramesh {


    public static void main(String[] arge){
        int age = 19;
        boolean votercard = true;
        char gender='m';

         if (age>18 && votercard && (gender=='m'||gender=='M')){
            System.out.println("not eligible bcoz age not satisfied ");
        }
        else if (age>21 && votercard && (gender=='f'||gender=='F')) {
            System.out.println("not eligible bcoz  votercard is not available ");

        }else {
            System.out.println("not eligible bcoz both age and votercard are not satisfied");

        }
    }

}
