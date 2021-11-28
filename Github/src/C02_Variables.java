

public class C02_Variables {

	public static void main(String[] args) {
	
		String okul="Yildiz Koleji";
		
		//String okul="Mehmet Koleji"
        // ayný isim ve deðiþken türü ile ikinci defa variable oluþturulamaz. (okul)
		
		// farklý data türü de olsa ayný isimle ikinci defa variable oluþturulamaz
		//int okul=20
				
		// var olan bir variable a (okul) yeni deðer atayabiliriz. okul yildiz kolejiydi mehmet koleji atadýk.
		
		okul="Mehmet Koleji";
		
		System.out.println(okul); // Mehmet Koleji
		
		// yazdýrma iþleminde açýklama klemek istersek
		// mesela okul adi : Mehmet Koleji yazdýralým
		
	//	sabit açýklama :
		// "okul adi" çift týrnak içinde olduðu için sabittir deðiþmez.
		
		System.out.println("okul adi : "+ okul);
		System.out.println("okul adi : "+ "okul"); // okul adi : okul
		
	}

}
