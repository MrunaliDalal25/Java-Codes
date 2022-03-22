import java.util.Scanner;
import java.util.*;
public class switchMonths {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		String monthString=" ";
		
		System.out.println("Input a month number: ");
		int month=sc.nextInt();
		
		switch(month) {
		case 1:monthString="1";
		System.out.println("January");
		break;
		case 2:monthString="2";
		System.out.println("february");
		break;
		case 3:monthString="3";
		System.out.println("March");
		break;
		case 4:monthString="4";
		System.out.println("April");
		break;
		case 5:monthString="5";
		System.out.println("May");
		break;
		case 6:monthString="6";
		System.out.println("June");
		break;
		case 7:monthString="7";
		System.out.println("July");
		break;
		case 8:monthString="8";
		System.out.println("August");
		break;
		case 9:monthString="9";
		System.out.println("September");
		break;
		case 10:monthString="10";
		System.out.println("October");
		break;
		case 11:monthString="11";
		System.out.println("November");
		break;
		case 12:monthString="12";
		System.out.println("December");
		break;
		default:System.out.println("Invalid Month!!");
		
		}
	}
}
		