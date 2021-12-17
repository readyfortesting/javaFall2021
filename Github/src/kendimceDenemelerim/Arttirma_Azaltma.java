package kendimceDenemelerim;

public class Arttirma_Azaltma {

	public static void main(String[] args) {
		
		/* ++  yazinca  degiskenin degeri 1 arttirilir
		 * -- yazilinca degiskenin  degeri 1 eksiltilir
		 * ++, -- degiskenden once yazilirsa once arttirma ya da azaltma islemi uygulanir
		 * ++,-- degiskenden sonra eklenirse once degiskeni konsola yazdir daha sonra arttir ya da azalt diye anlar JAVA.
		 */

		int sayi1=20;
		int sayi2=30;
		sayi1++;
		System.out.println(sayi1); //21
		sayi2++;
		System.out.println(sayi2);//31
		sayi1--;
		System.out.println(sayi1); //20
		sayi2--;
		System.out.println(sayi2); //30
		
		
		int sayi3=10;
		int sayi4=5;
		
		++sayi3;
		System.out.println(sayi3);//11
		
		++sayi4;
		System.out.println(sayi4);//6
		
		--sayi3;
		System.out.println(sayi3);//10
		System.out.println(++sayi3);//11
		
		--sayi4;
		System.out.println(sayi4);//5
		System.out.println(++sayi4);//6
		
		
		
		
		
	}

}
