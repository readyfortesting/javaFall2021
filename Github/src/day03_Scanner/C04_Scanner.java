package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
	
		// KULLANICIDAN DE�ER ALMAK
		
		// KULLANICIDAN DE�ER ALMAK ���N 3 ADIM TAK�P ED�L�R 
		
		//1-) ADIM : SCANNER OBJES� OLU�TURMAK
	    Scanner scan=new Scanner(System.in);
	    
	    //2.ADIM : KULLANICIYA NE �STED���M�Z� S�YLEMEK GEREK�R.
	    //KULLANICI ADI MI,��FRE M� �S�M M� N �STED���M�Z� YAZMALIYIZ.
	    System.out.println("lutfen isminizi yaziniz");
	    
	    // isim istedi�imize g�re String olmal� variavle i�ine at�lmal�.
	    String isim=scan.next();
	    
	    System.out.print("isminiz..:"+isim);
	    
	    
	    // scan bir scanner objesidir.
	    // isim olarak farkl� bir isim yazsak da �al���r ama biz scasn demeyi tercih ederiz.
	    // scan bir obje oldu�u i�in data t�r� non-primitive dir.
	    //primitive data t�rleri sadece de�er i�erirken;
	    // non-primitive data t�rleri de�erin yan�nda method'lar bar�nd�r�r.
	    // scan. dedi�imizde kullanabilece�imiz bu methodlari g�rebiliriz.
	    // non-primitiveler %90 bar�nd�r�r.
	    // STR�NG NON-PRIMITIVED�R.
	    
	    
	    
		// SCANNER KULLANICIDAN DE�ER ALMAK �ST�YORSAK

		//(sYSTEM.�N) PARANTEZ�N ���NE PARAMETRE DEN�R
		
		scan.close();
		
	    
	    
	}

}
