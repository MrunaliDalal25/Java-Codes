import java.util.*;
public class floatingPoint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter floating point Number: ");
				double a=sc.nextDouble();
				System.out.println("Enter Another floating point Number: ");
				double b=sc.nextDouble();
					a=Math.round(a*1000);
					a=a/1000;
					b=Math.round(b*1000);
					b=b/1000;
					
					if(a==b)
					{
						System.out.println("They are Same Upto Three Decimal Places");
					}
					else {
						System.out.println("They are Different");
					}
	}

}
