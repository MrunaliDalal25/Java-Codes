public class InstanceVariableExample {
        int age; // instance variable

        public static void main(String[] args) {
            InstanceVariableExample p1 = new InstanceVariableExample();
            p1.age = 20;

            InstanceVariableExample p2 = new InstanceVariableExample();
            p2.age = 30;

            System.out.println(p1.age); // 20
            System.out.println(p2.age); // 30
        }
    }


