package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {
		
		/*swap: de�i�tirmek
		 * 
		 * * 1- Verilen sayi1 ve sayi2 variable�larinin degerlerini degistiren (SWAP) bir program yaziniz
            Orn : sayi1=10 ve sayi2=20;
            kod calistiktan sonra
            sayi1=20 ve sayi2=10 de�er atamas� yapmadan sayi1=20 sayi2=10 olmal�.
            
            
		 * 
		 * 
		 */
		
		
		int sayi1=10;
		int sayi2=20;
		
		//ba�lang��ta sayi1=10 sayi2=20 yazd�rl�m. bunun i�in sabit k�s�m ve de�ikenleri  10 ve 20 de�i�ken.
		System.out.println("baslangictasayi1="+ sayi1 + "ve sayi2=" + sayi2);
		

		// 1. ad�m bo� bir variable olu�tur
		int bos;
		 // 2.ad�m sayi2'yi bo� variable'a atayal�m.
		bos=sayi2;
		// 3.ad�m sayi2 kovas�na sayi1 de�erini atayal�m
		sayi2=sayi1;
		// bo� variable'daki de�eri sayi1'e atayal�m.
		sayi1=bos;
		
		//sayi 1 10, sayi 2 20,bo� variable 20 olacak.
		
		
		///3.ad�m  sayi1 = bos dedi�iizde sayi 1 variable gideriz eski de�eri �ld�r�r�z sayyi1 20 
		
		System.out.println("sonuctasayi1=" );
		
		
	}
	

}
