

public class Q_01 {

	public static void main(String[] args) {
	
		
		//SORU 1)  verilen 12345 say�s�n�n rakamlar de�erlerini yukar�dan a�a��ya do�ru yazd�r�n�z
				// ex: input: 
//				    output: 1 // B�RLER BASAMA�INI BULMAK ���N modulus KULLANILIR.
//				            2
//				            3
//				            4
//				            5
				
				int sayi=12345;
				int birler= sayi%10; //birler basamagi sayinin 10 a bolumunden kalan�d�r.--> 5
				int onlar=(sayi/10)%10;
				int yuzler=(sayi/100)%10;
				int binler=(sayi/1000)%10;
				int onBinler=(sayi/10000);
				
			//	System.out.println(onBinler);
				//System.out.println(binler);
				//System.out.println(yuzler);    //bu 5 sat�r yerine TEK 1 SATIRDA YAZAB�L�R�Z.
				//System.out.println(onlar);
				//System.out.println(birler);
				
				
				/*
			    System.out.println(binler);
				System.out.println(yuzler);
				System.out.println(onlar);
				System.out.println(birler);
				 */
				
				// consolda alt satira yazd�rmak i�in "\n"  komutu kullan�l�r.
											
		System.out.println(onBinler+ "\n" + binler+"\n"+ yuzler+"\n" + onlar +"\n" + birler);  // tek bir surada ters slash n \n ile yazd�k.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
