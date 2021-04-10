package hafta_7_Flipgrid;

public class Child extends Parent {

	@Override
	public void dortIslem() {
		System.out.println(3*6);
	}

	@Override
	public void ogrenciBilgileri() {
		System.out.println("Ahmet");
		System.out.println("Koc");
		System.out.println("Okul no:876423");
		System.out.println("Bolum : Elektronik muhendisligi");
	}

	

	
	/*
	 * ==>Overriding : 	Yontem gecersiz kilma, Atadan geleni cocugun degistirmesi diyebiliriz
	 * 					Yani bura da da goruldugu gibi Paren den gelen method
	 * 					body'si degistirilerek kullaniliyor
	 * 					final, private ve static Override edilemez
	 * 					Parent class daki methoda Overridden Method
	 * 					Child class daki method a da Overriding Method denir
	 * 					Child class in acces modifier i parent inkinle ya ayni yada daha genis olmalidir
	 * 					public > protected > default
	 * 				   
	 */
	

}
