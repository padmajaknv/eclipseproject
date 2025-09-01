package smruti;

public class privateclassAcess {
        private String sName;
        public void name(String name) {
            sName = name;
        }
        private void printName() {
            System.out.println("Name of student is: " + sName);
        }
        public void showName() {
            printName();
        }
}
class Start {
    public static void main(String[] args) {
        privateclassAcess obj = new privateclassAcess();
        obj.name("Smruti");
        obj.showName();
    }
}
// calling private class outsite the class