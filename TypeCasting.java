public class TypeCasting{
	public static void main(String[]args){
		//impilcit Type Casting
		System.out.println("Implicit Type Casting");
		
		char a = 'A';
		System.out.println("Charectar Is : " + a);
        
		
		int d = a ;
		System.out.println("Intgar Number Is : " + d);
		
		long e = a;
		System.out.println("Long Number Is : " + e);
		
		float f = a;
		System.out.println("Float Number Is : " + f);
		
		double g = a;
		System.out.println("Double Number Is : " + g);

        System.out.println("\n");
		//explicit Type Casting
		double x = 36.5;
		int y = (int) x ;
		System.out.println(x);
		System.out.println(y);
		
		
	}
}
