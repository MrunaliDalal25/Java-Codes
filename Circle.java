import java.nio.file.FileAlreadyExistsException;
import java.util.*;
public class Circle {

	static double radius;
	static final double PI=3.14;
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double calculateArea(double radius)
	{
		return(Math.PI*radius*radius);
		
	}
	public double calculatePerimeter(double radius)
	{
		return(2*Math.PI*radius);
	}
	public static void main(String[] args) {
		Circle c=new Circle(radius);
		System.out.println("Enter the Radius: ");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
	  System.out.println("Area of circle:" +c.calculateArea(radius));
	  System.out.println("Perimeter of Circle is:" +c.calculatePerimeter(radius));
	  
    }  
		
		
	}


