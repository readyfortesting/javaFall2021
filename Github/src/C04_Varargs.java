

public class C04_Varargs {

	public static void main(String[] args) {
		
		KafanaGoreIslem(5,10,13,0);
		
		//Varargs'da hic eleman olmasa da Java itiraz etmez,once int olarak tanimlanan sayilari eslestirir
		// kalan tum sayilari varargsa doldurur.
	}
	
	


private static void KafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4,int ...sayilar ) {
int toplam=0;
for (int each : sayilar) { // sayilar varargs'ina git ordaki herbir each'i bana getir
	toplam+=each;
	
}
System.out.println("ilk sayi ile digerlerinin toplaminin carpimi :" + sayi1 * toplam); // girilen sayilarin toplami :61
// ilk sayi ile digerlerinin toplaminin carpimi :65
	
	
}
}