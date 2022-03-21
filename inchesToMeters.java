import java.util.Scanner;

public class inchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a Value for Inch: ");
		
		double inch=sc.nextDouble();
		double meters=inch*0.0254;
		System.out.println("Inches to meters is:"  +meters);
	}

}
