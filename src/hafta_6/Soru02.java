package hafta_6;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {

		/* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */

		Scanner scan=new Scanner(System.in);
		
		int toplam=0;//3+5
		int count=0;//1
		//int sayi=1;
		
		do {
		System.out.println("Lutfen bir sayi giriniz");	
		int sayi=scan.nextInt();
		
		toplam+=sayi;
		
		count++;
		
		}while(toplam<100);
		
		System.out.print(count+" kere sayi girdiniz. bu kadar sayi yeter\nOyun bitti"
				+ "\nGirilen sayilarin toplami : "+toplam);
		
scan.close();
	}

}
