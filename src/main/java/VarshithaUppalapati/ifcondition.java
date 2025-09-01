package VarshithaUppalapati;

public class ifcondition {
    public static void main(String[] args) {
        int age=29;
        char gender = 'M';
        boolean votercard = true;
        if (age >= 21 &&  votercard == true  &&  gender == 'M') {
            System.out.println("Males are elgible for voting");
        } else if (age >= 18 && votercard == true && gender == 'F') {
            System.out.println("Females are elgible for voting");
    }
        else {
        System.out.println(" Not Eligible for voting");
    }
}
}