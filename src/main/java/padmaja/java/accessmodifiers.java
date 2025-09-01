package padmaja.java;

public class accessmodifiers {
        int i = 5;
        private int pi = 6;

        void a(){
            System.out.println("Void a");
        }

        private void pa(){
            System.out.println("Private void a");
        }
         public void c() {
             pa();
             System.out.println(i);
         }
        public static void main(String[] args) {
            accessmodifiers am = new accessmodifiers();
            System.out.println(am.i);
            am.a();
        }
}
