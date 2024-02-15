import java.util.Scanner ;

public class Prac_1c{
	public static void main(String[] s){
		System.out.println("NAME : HARSHIT PANCHOLI");
		System.out.println("ENROLLMENT NO. : 220410107026\n");
		
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter distance in meter :");
		Double meter = in.nextDouble() ;
		
		Double feet = meter * 3.28084 ;
		
		System.out.println("Distance in feet equivalent to " + meter + " meter is " + feet + " feet.");
	}
}
