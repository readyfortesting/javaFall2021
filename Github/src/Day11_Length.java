

public class Day11_Length {

	public static void main(String[] args) {
		
		// LENGTH : bÝR STRÝNGÝN ÝCÝNDEKÝ KARAKTER SAYÝSÝNÝ DONDURUR.
		   // Mustafa 
		  //  0123456   Son a harfinin indexi:6
		 //   1234567 Mustafa kelime uzunlugu  Length (uzunluk) : 7 'dir.
		 //   Son harfin index'i herzaman length-1 olur.
		 // length 1'le baþlar, index 0'la baþlar.
		
		String str1="Ali Kahyaoglu";
  System.out.println(str1.length()); //13
		
  String denemem1= "Vedat Inceefe";
  System.out.println(denemem1.length()); //13 Isimle soyisim arasindaki boslugu da sayar 13 cikar.
  
  String hiclik = "";
  System.out.println(hiclik.length()); //0 Cunku "" (hiclik) bir karakter degildir,length'i 0'dir.
  
 //****** String degeratanmamis=null; ******
//  System.out.println(degeratanmamis.length()); // isim variable'ina hicbir deger atanmamis demektir.
  // Exception in thread "main" java.lang.NullPointerException
	// at kendimceDenemelerim.Day11_Length.main(Day11_Length.java:24) BU HATAYÝ VERÝR NULL OLUNCA.
  
  
  // SORU : denemem1'in  son harfini yazdirin.
  
  System.out.println(denemem1.charAt(denemem1.length()-1)); // e verir :)
  
  
// Soru: aslanim10 son harfini yazdiriniz.
  String aslanim1="balkupum";
  System.out.println(aslanim1.charAt(aslanim1.length()-1)); // m yazar :)
  
  // Soru: yavasyavas son harfini yazdirin.
  String yavasyavas="olacak";
  System.out.println(yavasyavas.charAt(yavasyavas.length()-1)); // k yazar :)
  
  
  
  
  
		
		
		
		
		
		
		
	}

}
