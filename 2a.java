import java.util.Scanner ;

public class BMI{
	public static void main(String[] s){
		System.out.println("NAME : HARSHIT PANCHOLI");
		System.out.println("ENROLLMENT NO. : 220410107026\n");
		
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter weight in pounds :");
		double wp = in.nextDouble() ;
		System.out.print("Enter height in inches :");
		double hi = in.nextDouble() ;
		
		double wk = wp * (0.45359237) ;
		System.out.println("Weight in kg : " + wk );
		double hm = hi * (.0254) ;
		System.out.println("Height in meter : " + hm );
		
		double BMI = wk / ( hm * hm ) ;
		System.out.println("Body Mass Index (BMI) of a person is " + BMI );
	}
}
