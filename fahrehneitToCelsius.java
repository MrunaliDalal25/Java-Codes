import java.util.*;
public class fahrehneitToCelsius {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				System.out.println("Input a Degree in Fahrenheit: ");
				
				double Fahrenheit=sc.nextDouble();
				double Celsius=((5*(Fahrenheit-32.0))/9);
				System.out.println(Fahrenheit+ "temperature in Celsius is:"+Celsius);
				
				
			}
	}


