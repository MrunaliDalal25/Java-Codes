import java.util.Scanner;
public class Square {
	static double side;
	
	Square(double side)
	{
		this.side=side;
	}	
public double calculateArea(double side)
		{
			return(side);
		}
		public double calculatePerimeter(double side)
		{
			return(4*side);
		}
  public static void main(String[] args) {
			Square s =new Square(side);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the side: ");
			side=sc.nextDouble();
			System.out.println("Area of Square:" +s.calculateArea(side));
		  System.out.println("Perimeter of Rectangle is:" +s.calculatePerimeter(side));
		}
		}
	


