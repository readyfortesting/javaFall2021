

public class C02_Variables {

	public static void main(String[] args) {
	
		String okul="Yildiz Koleji";
		
		//String okul="Mehmet Koleji"
        // ayn� isim ve de�i�ken t�r� ile ikinci defa variable olu�turulamaz. (okul)
		
		// farkl� data t�r� de olsa ayn� isimle ikinci defa variable olu�turulamaz
		//int okul=20
				
		// var olan bir variable a (okul) yeni de�er atayabiliriz. okul yildiz kolejiydi mehmet koleji atad�k.
		
		okul="Mehmet Koleji";
		
		System.out.println(okul); // Mehmet Koleji
		
		// yazd�rma i�leminde a��klama klemek istersek
		// mesela okul adi : Mehmet Koleji yazd�ral�m
		
	//	sabit a��klama :
		// "okul adi" �ift t�rnak i�inde oldu�u i�in sabittir de�i�mez.
		
		System.out.println("okul adi : "+ okul);
		System.out.println("okul adi : "+ "okul"); // okul adi : okul
		
	}

}
