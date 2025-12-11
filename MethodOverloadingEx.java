public class MethodOverloadingEx {


        // Method 1
        void add(int a, int b) {
            System.out.println(a + b);
        }

        // Method 2 (same name, different parameters)
        void add(int a, int b, int c) {
            System.out.println(a + b + c);
        }

        public static void main(String[] args) {
            MethodOverloadingEx obj = new MethodOverloadingEx();

            obj.add(5, 10);       // Calls method with 2 numbers
            obj.add(5, 10, 15);   // Calls method with 3 numbers
        }
    }


