import java.util.* ;

class desc_order{
	public static void main(String[] s){
		System.out.println("NAME : HARSHIT PANCHOLI");
		System.out.println("ENROLLMENT NO. : 220410107026\n");
		
		Scanner input = new Scanner ( System.in ) ;
		System.out.print("Enter number A : ");
		double a = input.nextDouble() ;
		System.out.print("Enter number B : ");
		double b = input.nextDouble() ;
		System.out.print("Enter number C : ");
		double c = input.nextDouble() ;
		double temp = 0 ;
		
		if ( a > b ){
			if ( c > a ){
				temp = b ;
				b = a ;
				a = c ;
				c = temp ;
			}
			else if (a > c && c > b){
				temp = b ;
				b = c ;
				c = temp ;
			}
		}
		else {
			if (c > b){
				temp = a ;
				a = c ;
				c = temp ;
			}
			else if (b > c && c > a){
				temp = a ;
				a = b ;
				b = c ;
				c = temp ;
			}
			else {
				temp = a ;
				a = b ;
				b = temp ;
			}
		}
		System.out.println("\nDecreasing order is : " + a + "," + b + "," + c) ;
	}
}
