package day04_IncrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
	
		// soru 3) KULLANICIDAN YARI�AP �STEY�P �EMBER�N �EVRES�N� VE DA�REN�N ALANINI HESAPLAYIP YAZDIRINIZ.
		// kullan�c�dan de�er almak i�in SCANNER OBJES� olu�turmal�y�z.
		
		Scanner scan=new Scanner(System.in); // Scanner alt�nda k�rm�z� uyar� verince yakla��m impor scanner java util yap�yoruz.
		// SONRA KULLLANICIYA MESAJ VERMEK ���N
		System.out.println("Lutfen cemberin yaricapini giriniz"); // virg�ll� bir say� girmek isteyebilir kullan�c� bunun i�in double kullan�l�r.
		
		double yaricap=scan.nextDouble(); // scan. nokta dedi�imizda zaten nextDouble �NER�R.
		
		double cevre= 2*3.14*yaricap;  //�EVRE form�l�       cevre= 2*3.14*yaricap
		double alan= 3.14*yaricap*yaricap; // ALAN FORM�L�   alan=3.14*yaricap*yaricap
		
		// �rnek : cemberin cevresi : 25.7
		//         dairenin alani : 26,31
		// b�yle bir �ey yapmak istedi�imizde �nce sabit k�s�m i�aretlenir. dairenin cevresi : (buras� sabit k�s�m)
		                                                                 // dairenin alani:  (buras� sabit k�s�m)
		                                                                 // 25.7 ve 26.31 de�erler
		System.out.println("cembverin cevresi : " + cevre);
		System.out.println("dairenin alani : " +  alan);  // a�a��daki kutuda L�tfen cemberin yaricapini giriniz cikar,oraya 10 yazal�m
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
