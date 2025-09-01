package indira;

public class array {
    public static void main(String[] args) {

        char[] x = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        for (int i = 0; i < x.length; i =i+ 2) {
            System.out.print(x[i] + " ");
        }
    }
}
