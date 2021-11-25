
public class KarakterinKacDefaKulBulma {

	public static void main(String[] args) {
		
		
		String metin="Java ogrenmek hem zor hem de eglenceli";
		char karakter='e';
		int tane=0;
		for(int i =0; i<metin.length();i++){
		  if(karakter==metin.charAt(i)){
		    ++tane;
		  }
		}
		System.out.println(karakter + " yazi icinde :  " + tane );
		  }
		
		
		
		
		

	}


