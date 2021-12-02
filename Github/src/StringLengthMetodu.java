
public class StringLengthMetodu {

	public static void main(String[] args) {
		// STRING METODLARI : length()
		/* length() : Stringi'in uzunluðunu,kaç karakterden oluþtuðunu söyler.
		 * 
		 * 
		 * 
		 */
			String isim="Ali Esat";
			String dil="JAVA";
			String bilgi="String uzunlugu elde etme";
			
			System.out.println(isim); // Ali Esat
			System.out.println(dil);  // JAVA
			System.out.println(bilgi); // String uzunlugu elde etme
			
		int isimUzunluk=isim.length();  // degisken olusturduk
		int dilUzunluk=dil.length();
		int bilgiUzunluk=bilgi.length();
		
		
		System.out.println(isimUzunluk); //8
		System.out.println(dilUzunluk);	//4
		System.out.println(bilgiUzunluk); //25	
	}

}
