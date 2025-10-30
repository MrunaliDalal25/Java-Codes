import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();

        System.out.println("1:Addition");
        System.out.println("2:Substraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");
        System.out.println("5:Modulo");

        int choice= sc.nextInt();
        double result;

        switch(choice){
            case 1:
                result=a+b;
                System.out.println("Addition " +result);
                break;

            case 2:
                result=a-b;
                System.out.println("Substraction:" +result);
                break;

            case 3:
                result=a*b;
                System.out.println("Multiplication:" +result);
                break;

            case 4:
                result=a/b;
                System.out.println("Division:" +result);
                break;

            case 5:
                result=a%b;
                System.out.println("Modulo:" +result);
                break;

            default:
            System.out.println("invalid choice");
        }
    }

}
