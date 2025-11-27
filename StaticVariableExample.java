public class StaticVariableExample {

        static String school = "ABC School"; // static variable

        public static void main(String[] args) {
            StaticVariableExample s1 = new StaticVariableExample();
            StaticVariableExample s2 = new StaticVariableExample();

            System.out.println(s1.school); // ABC School
            System.out.println(s2.school); // ABC School
        }
}
