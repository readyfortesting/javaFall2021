package day04_IncrementDecrement;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
	
		// soru 3) KULLANICIDAN YARIÇAP ÝSTEYÝP ÇEMBERÝN ÇEVRESÝNÝ VE DAÝRENÝN ALANINI HESAPLAYIP YAZDIRINIZ.
		// kullanýcýdan deðer almak için SCANNER OBJESÝ oluþturmalýyýz.
		
		Scanner scan=new Scanner(System.in); // Scanner altýnda kýrmýzý uyarý verince yaklaþým impor scanner java util yapýyoruz.
		// SONRA KULLLANICIYA MESAJ VERMEK ÝÇÝN
		System.out.println("Lutfen cemberin yaricapini giriniz"); // virgüllü bir sayý girmek isteyebilir kullanýcý bunun için double kullanýlýr.
		
		double yaricap=scan.nextDouble(); // scan. nokta dediðimizda zaten nextDouble ÖNERÝR.
		
		double cevre= 2*3.14*yaricap;  //ÇEVRE formülü       cevre= 2*3.14*yaricap
		double alan= 3.14*yaricap*yaricap; // ALAN FORMÜLÜ   alan=3.14*yaricap*yaricap
		
		// örnek : cemberin cevresi : 25.7
		//         dairenin alani : 26,31
		// böyle bir þey yapmak istediðimizde önce sabit kýsým iþaretlenir. dairenin cevresi : (burasý sabit kýsým)
		                                                                 // dairenin alani:  (burasý sabit kýsým)
		                                                                 // 25.7 ve 26.31 deðerler
		System.out.println("cembverin cevresi : " + cevre);
		System.out.println("dairenin alani : " +  alan);  // aþaðýdaki kutuda Lütfen cemberin yaricapini giriniz cikar,oraya 10 yazalým
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}
