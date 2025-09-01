package ramya;

public class array {
    public static void main(String[] args){
        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

         for (int i = 0; i < characters.length; i +=2) {
                System.out.println("Index " + i + ": " + characters[i]);
        }



    }
}
