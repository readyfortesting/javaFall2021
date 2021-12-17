package Day32_varargs_StringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {

		topla(5,8,10,10,13,0,15);
		
//******* VARARGS List gibi davranir fakat ARRAY methodlari gibi calisir.  ***********/////
		
		
	}

	private static void topla(int...sayilar) {
		int toplam=0;
		for (int each : sayilar) { // sayilar varargs'ina git ordaki herbir each'i bana getir
			toplam+=each;
			
		}
		System.out.println("girilen sayilarin toplami :" + toplam); // girilen sayilarin toplami :61
	}

}
