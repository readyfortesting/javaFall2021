

public class C05_Varargs {

	public static void main(String[] args) {
	
		topla(5,10,13,0);
	}
	
	
	//******* VARARGS List gibi davranir fakat ARRAY methodlari gibi calisir.  ***********/////
		//**** varargs sonucu olmali her zaman****
	//*******Varargs'dan once farkli parametreler kullanilabilir ama varargs'dan sonra parametre yazilamaz
	// yazarsaniz Java varargs ''java son parametre olmalýdýr diye uyarir ve COMPÝLE TÝME ERROR verir"********
			
		

		private static void topla(int...sayilar) {
			int toplam=0;
			for (int each : sayilar) { // sayilar varargs'ina git ordaki herbir each'i bana getir
				toplam+=each;
				
			}
			System.out.println("girilen sayilarin toplami :" + toplam); // girilen sayilarin toplami :61
}
}
