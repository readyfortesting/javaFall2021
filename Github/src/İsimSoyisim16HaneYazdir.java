

import java.util.Scanner;

public class ÝsimSoyisim16HaneYazdir {

	public static String main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi ve soyisminizi giriniz");
		String isim=scan.next();
		String soyisim=scan.next();
		System.out.println("Lutfen kredi kart numaranizi giriniz");
		String kkNo=scan.next();
		
		adSoyad(isim,soyisim);
		
		kk1(kkNo);
		
		return kkNo;
		
		
		

	}

	private static void kk1(String kkNo) {
		// TODO Auto-generated method stub
		
	}

	private static void  kk(String kkNo) {
		kkNo=kkNo.substring(0, 4)+" " + kkNo.substring(4, 8)+" " + kkNo.substring(8, 12)+ " " + kkNo.substring(12, 16);
		
		
		String isim;
		
		
		//System.out.println(kk(kkNo));
		//System.out.println(adSoyad(isim,soyisim));
		
		
		
	}

	private static String adSoyad(String isim, String soyisim) {
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toUpperCase()+soyisim.substring(1).toLowerCase();
		
		
		
		
				
				
				
				return isim+" "+soyisim;
		
	}

}
