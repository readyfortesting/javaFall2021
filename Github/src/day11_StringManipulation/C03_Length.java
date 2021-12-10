package day11_StringManipulation;

public class C03_Length {

	public static void main(String[] args) {
		
		// LENGTH : bÝR STRÝNGÝN ÝCÝNDEKÝ KARAKTER SAYÝSÝNÝ DONDURUR.
		   // Mustafa 
		  //  0123456   Son a harfinin indexi:6
		 //   1234567 Mustafa kelime uzunlugu  Length (uzunluk) : 7 'dir.
		 //   Son harfin index'i herzaman length-1 olur.
		 // length 1'le baþlar, index 0'la baþlar.
		
		String str1="Ali Kahyaoglu";
  System.out.println(str1.length()); //13
  
 // Ali Kahyaoglu'nun lenght i // 13
		
  // Verilen str1'in son harfini yazdirin.
  System.out.println(str1.charAt(str1.length()-1)); // u harfini verir.
  
  
  String str2="";
  System.out.println(str2.length()); // 0
  
  String str3=null;
  //System.out.println(str3.length());// java.lang.NullPointerException
  
  String str4;
  System.out.println(str3);// null
 // System.out.println(str4);
  // null pointer olusturdugumuz fakat sonra kullanacagimiz bir stringi isaretlemek icin kullanilir.
  // Bir stringi yazdirdigimizda null cikiyorsa turkce olarak
  // ben bu degiskeni olusturdum ama henuz deger atamadim demek istiyor.
  // Eger Stringi olusturur fakat deger atamazsak yazdirdiklarimizdan hata aliriz.
  
  
  
  
	}

}
