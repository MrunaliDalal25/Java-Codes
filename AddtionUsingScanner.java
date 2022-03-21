import java.util.Scanner;
public class AddtionUsingScanner {

	public static void main(String[] args) {
	System.out.println("Enter first Number");
	Scanner sc=new Scanner(System.in);
	int A=sc.nextInt();
	System.out.println("Enter Second Number");
	int B=sc.nextInt();
	int C=A+B;
	System.out.println("The addition of two number is:" +C);
	}

}
