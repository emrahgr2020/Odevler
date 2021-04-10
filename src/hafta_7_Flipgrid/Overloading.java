package hafta_7_Flipgrid;

public class Overloading {

	public static void main(String[] args) {
		/*
		 * Overloading==>	Yontem Asiri yukleme
		 * 				 	Ayni methodu signature degistirerek kullanma
		 * 
		 */

		toplama(2,4);
		toplama(4,6,5);
		toplama(3,6,8,9);
		toplama(3.0,2);
		
	}

	
	public static void toplama (int a, int b) {
		System.out.println("Toplamlari: "+(a+b));
	}
	public static void toplama (double a, int b) {
		System.out.println("Toplamlari: "+(a+b));
	}
	public static void toplama (int a, int b,int c) {
		System.out.println("Toplamlari: "+(a+b+c));
	}
	public static void toplama (int a, int b,int c, int d) {
		System.out.println("Toplamlari: "+(a+b+c+d));
	}
	
	
}
