package hafta_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soru02 {
	 /*  Rastgele kullanıcı adı oluşturan JAVA kodu yazınız.
		 *  1. Adım : Kullanıcıdan ismini isteyelim
		 *  2. Adım : Kullanıcı adındaki boşlukları silelim.
		 *  3. Adım : Kullanıcı adının alınabilir olup olmadığına bakalım.
		 *  4. Adım : Eğer bizim listemizde öyle bir kullanıcı adı yoksa kullanıcı adı, 
		 *  kullanıcının girdiği isim olsun.
		 *  5. Adım : Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim, 
		 *  ve gösterelim.
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ayşe");
			veritabanindakiKullaniciListesi.add("Süleyman");
			veritabanindakiKullaniciListesi.add("Nazmi");
		 */

	public static void main(String[] args) {
		
		userName();
		
	}
	
	public static void userName() {
		
		List<String> veritabanindakiKullaniciListesi= new ArrayList<>();
		veritabanindakiKullaniciListesi.add("Emrah");
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Cengiz");
		veritabanindakiKullaniciListesi.add("Fatih");
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen kullanici adinizi giriniz");
		String kullaniciAdi=scan.nextLine();
		
		String newKullaniciAdi=kullaniciAdi.replaceAll(" ", "");
		//System.out.println(newKullaniciAdi);
		
		Random rnd = new Random();
		int sayi=rnd.nextInt();
		
		if(!veritabanindakiKullaniciListesi.contains(newKullaniciAdi)) {
			System.out.println("Kullanici adiniz : "+ newKullaniciAdi);
		}else {
			System.out.println("Tavsiye edilen yeni kullanici adi : "+(newKullaniciAdi+sayi));
		}
		
		scan.close();
	}

}
