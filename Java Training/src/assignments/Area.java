package assignments;

public class Area {
	
	
	public static double areaOfSquare(double a) {
		
		
		return a*a;
	}
	
	public static double areaOfTrapezium(double h,double a,double b) {
		double result;
		
		double j=a+b;
		result= 0.5*h*j;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(areaOfSquare(56.27));
		System.out.println(areaOfTrapezium(1, 2,2));

	}

}
