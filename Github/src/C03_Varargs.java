

public class C03_Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		KafanaGoreTopla(5,10,13,0);
		
		}
	
	private static void KafanaGoreTopla(int sayi1, int ...sayilar ) {
		int toplam=0;
		for (int each : sayilar) { // sayilar varargs'ina git ordaki herbir each'i bana getir
			toplam+=each;
			
		}
		System.out.println("ilk sayi ile digerlerinin toplaminin carpimi :" + sayi1 * toplam); // girilen sayilarin toplami :61
	
	}

}
