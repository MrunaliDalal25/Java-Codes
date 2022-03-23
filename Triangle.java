
import java.util.*;
public class Triangle {

static double height;
static double breadth;
	public double calculateArea(double height,double breadth)
		{
			return(height*breadth/2);
		}
		public double calculatePerimeter(double height,double breadth)
		{
			return(3*height*breadth);

			}

		public static void main(String[] args) {
			Triangle t=new Triangle();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the height: ");
			height=sc.nextDouble();
			System.out.println("Enter the breadth: ");
			breadth=sc.nextDouble();
		  System.out.println("Area of Triangle:" +t.calculateArea(height, breadth));
		  System.out.println("Perimeter of Triangle is:" +t.calculatePerimeter(height, breadth));
		}
		}
	


