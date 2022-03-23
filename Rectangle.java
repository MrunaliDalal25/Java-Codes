import java.util.Scanner;

public class Rectangle {
static double length;
static double breadth;
public double calculateArea(double length, double breadth)
{
	return(length*breadth);
}
public double calculatePerimeter(double length,double breadth)
{
	return(2*(length+breadth));

	}

public static void main(String[] args) {
	Rectangle r=new Rectangle();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the length: ");
	length=sc.nextDouble();
	System.out.println("Enter the breadth: ");
	breadth=sc.nextDouble();
  System.out.println("Area of Rectangle:" +r.calculateArea(length,breadth));
  System.out.println("Perimeter of Rectangle is:" +r.calculatePerimeter(length,breadth));
}
}