
import java.util.*;
public class Triangle {

static double height;
static double breadth;
 
public Triangle(double height,double breadth)
{
	this.height=height;
	this.breadth=breadth;
}
	public double calculateArea(double height,double breadth)
		{
			return(height*breadth/2);
		}
		public double calculatePerimeter(double height,double breadth)
		{
			return(3*height*breadth);

			}

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the height: ");
			height=sc.nextDouble();
			System.out.println("Enter the breadth: ");
			breadth=sc.nextDouble();
			Triangle t=new Triangle(height,breadth);
		  System.out.println("Area of Triangle:" +t.calculateArea(height, breadth));
		  System.out.println("Perimeter of Triangle is:" +t.calculatePerimeter(height, breadth));
		}
		}
	


