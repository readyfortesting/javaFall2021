package day04_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
	
		// soru 7   Kullan�c�dan ismini alip isminin bas harfini yazdirin.
		
		// �nce kullan�c�dan ismini alal�m,ismini almak i�in �nce Scanner olu�turmal�y�z.
		
	Scanner scan = new Scanner(System.in);
	
	// kullan�c�ya mesaj vermek i�in
	System.out.println("L�tfen isminizi yaziniz");
	// ilk harfi istedi�i i�in tek bir karakter,akl�m�za hemen char gelir.
	
	char ilkHarf=scan.next().charAt(0);    //scan.next. (noktaya bas�nca bi,rs�r� �ey ��kar ordan charAt METODUNU SE�ER�Z.
	// �SM�N�Z�N �LK HARF� : M   , �NCE SAB�T KISIM SE��L�R  ve syso yap�p "" �ift t�rnak i�ine yaz�l�ryani ilk harfi : ,sonra de�i�ke : M
	
		System.out.println("isminizin ilk harfini : " + ilkHarf);
		
		
		
		
		
		
		

	}

}
