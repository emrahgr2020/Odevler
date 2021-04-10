package hafta_7;

public class Soru01 {
	/*
	//Swap islemini iki yoldan yaptiginiz java kodunu yaziniz.
			//1.Yol: 3. degisken kullanarak 
			//2.Yol: 3. degisken kullanmadan
	*/

	public static void main(String[] args) {
		System.out.println("=========1. yontem=========");
		int sayi1=40;
		int sayi2=70;
		int temp;
		System.out.println("Sayi 1 in ilk hali :"+sayi1);
		System.out.println("Sayi 2 nin ilk hali :"+sayi2);
		System.out.println();
		temp=sayi1;
		sayi1=sayi2;
		sayi2=temp;
		System.out.println("Sayi 1 in son hali :"+sayi1);
		System.out.println("Sayi 2 nin son hali :"+sayi2);
		
		System.out.println("=========2. yontem=========");
		
		int swap1=30;
		int swap2=20;
		System.out.println("swap1  in ilk hali :"+swap1);
		System.out.println("swap2 nin ilk hali :"+swap2);
		swap1=swap1+swap2;
		swap2=swap1-swap2;//swap1+swap2-swap2=swap1
		swap1=swap1-swap2;//swap1+swap2-swap1=swap2
		System.out.println();
		System.out.println("swap1 in son hali :"+swap1);
		System.out.println("swap2 nin son hali :"+swap2);
		
		
		
	}

}
