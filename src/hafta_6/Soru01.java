package hafta_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * // Stringi ters çevirmek için bir Java Programı yazın 
		 * //1.Yol: StringBuilder () kullanarak 
		 * //2.Yol: String Classini kullanarak 
		 * //3.Yol: Bir method oluşturun, ardından methodu main method dan çağırın
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ters cevrilmesini istediginiz bir String giriniz");
		String str = scan.nextLine();

		// 1.yol

		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		System.out.println("1.yol StringBuilder yontemi : " + sb.reverse());

		System.out.println();

		// 2.yol
		System.out.print("2.yol String ile : ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		// 3.yol

		tersCevir(str);
		
		scan.close();
	}

	public static void tersCevir(String str) {
		System.out.print("3.yol method ile : ");
		for (int i = str.length() - 1; i >= 0; i--) {

			String c = Character.toString(str.charAt(i));
			System.out.print(c);

		}

	}

}
