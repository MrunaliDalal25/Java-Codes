public class FinalVariableExample {
    final int MAX = 100; // final variable

        void show() {
            System.out.println(MAX);
            //MAX = 200;// ❌ Error: cannot change final variable
        }

        public static void main(String[] args) {
            new FinalVariableExample().show();
        }
    }


