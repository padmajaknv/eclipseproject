package JavaConcepts;

public class pubG {
    int level = 1;
    pubG(){
        System.out.println("Basic PubG Configuration");
    }

    pubG(String gunType){//constructor with a string parameter
        System.out.println("PubG configuration with : "+gunType);
//        if(gunType.equals("M16")){
//            System.out.println("");
//        }
        System.out.println("Constructor: "+level);
    }

//    static pubG(){
//
//    }

    public static void main(String[] args) {
        pubG player1 = new pubG();
        pubG player2 = new pubG();
        pubG player3 = new pubG("Sniper");
        pubG player4 = new pubG("M16");
        System.out.println(player1.level);
        player1.level = player1.level+3;
        System.out.println(player1.level);
        System.out.println(player2.level);
        System.out.println(player3.level);
        System.out.println(player4.level);
    }


}
