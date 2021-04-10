package hafta_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soru03 {
 /*
         * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
         * onceden tanimlanmis array�de olup olmadigini kullaniciya donen bir method
         * yaziniz
         *
         * Array={3,5,21,32,34,45,56,57,76,87,95}
         *
         * Input : 5  Output: Girdiginiz sayi Arrayde var
         * Input : 15 Output: Girdiginiz sayi Arrayde yok
         */
	public static void main(String[] args) {
		

		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		
		int arr[]= {3,5,21,32,34,12,45,56,57,76,87,95};
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.binarySearch(arr, sayi));
		if(Arrays.binarySearch(arr, sayi)>=0) {
			System.out.println("Girdiginiz sayi Arrayde var");
		}else {
			System.out.println("Girdiginiz sayi Arrayde yok");
		}
		scan.close();
	}

}
