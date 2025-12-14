
    class Student {
        String name;
        int age;

        public void printInfo() {
            System.out.println(this.name);
            System.out.println(this.age);
        }

    }
        public class OopEx2{
            public static void main(String[] args){
                Student s1=new Student();
                s1.name="Mrunali";
                s1.age=25;
                s1.printInfo();
            }
        }


