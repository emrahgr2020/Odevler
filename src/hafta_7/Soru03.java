package hafta_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru03 {
	 /*
     * Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
     * OUTPUT : [1,2,3,4,5,6,7,8,9]
     */

	public static void main(String[] args) {


		int arr1[]= {1,2,2,3,8,1,4,9,2,5,6,8,7,5,9,1};
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < arr1.length; i++) {
			if(!list.contains(arr1[i])) {
				list.add(arr1[i]);
			}
		}
		Collections.sort(list);
		System.out.println(list);
		Integer arr2[]=list.toArray(new Integer[0]);
		System.out.println("Yeni tekrarsiz Array = "+Arrays.toString(arr2));
		
		//Object tekrarsizArray[]= list.toArray();
		//System.out.println("2. yontem Yeni tekrarsiz Array = "+Arrays.toString(tekrarsizArray));	
			
				
		
		
		
	}

}
