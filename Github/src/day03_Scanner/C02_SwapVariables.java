package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		
		/*swap: deðiþtirmek
		 * 
		 * * 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
            Orn : sayi1=10 ve sayi2=20;
            kod calistiktan sonra
            sayi1=20 ve sayi2=10 deðer atamasý yapmadan sayi1=20 sayi2=10 olmalý.
            
            
		 * 
		 * 
		 */
		
		
		int sayi1=10;
		int sayi2=20;
		
		//baþlangýçta sayi1=10 sayi2=20 yazdýrlým. bunun için sabit kýsým ve deðikenleri  10 ve 20 deðiþken.
		System.out.println("baslangictasayi1="+ sayi1 + "ve sayi2=" + sayi2);
		

		// 1. adým boþ bir variable oluþtur
		int bos;
		 // 2.adým sayi2'yi boþ variable'a atayalým.
		bos=sayi2;
		// 3.adým sayi2 kovasýna sayi1 deðerini atayalým
		sayi2=sayi1;
		// boþ variable'daki deðeri sayi1'e atayalým.
		sayi1=bos;
		
		//sayi 1 10, sayi 2 20,boþ variable 20 olacak.
		
		
		///3.adým  sayi1 = bos dediðiizde sayi 1 variable gideriz eski deðeri öldürürüz sayyi1 20 
		
		System.out.println("sonuctasayi1=" );
		
		
	}
	

}
