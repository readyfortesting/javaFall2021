package day13_stringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
	// replaceAll : hepsini degistirir.
		
		// ekstra ozellikler var.
		// butun harfler x olsun istersek bunu replaceAll ile yapabiliriz.
		// butun harfleri degistirir, butun sayilari degistir,butun harf olmayanlari degistir gibi seyleri yapabiliriz.
		
		// replaceAll() metodunda REGULAR EXPRESSIONS kullanilabilir.
		
		//    \\d      digitleri sil. (sayilari)
		//    \\w       harf olanlari sil
		//     \\W     harf olmayanlari sil
		//     \\s     space,bosluklari kaldir.

        String str= "*Java 98ogrenmek c..ok k876olay";
        
        // replaceAll methodlari kullanarak Java ogrenmek cok kolay
        
        str=str.replaceAll("\\d", "");// *Java ogrenmek c..ok kolay
                    
        str=str.replaceAll("\\s", "x"); // *Javaxogrenmekxc..okxkolay
        
        str=str.replaceAll("\\W", ""); // Javaxogrenmekxcokxkolay
                
        str=str.replace("x", " ");
        System.out.println(str); //Java ogrenmek cok kolay
				
				
				
				
				
				
				
				
				
	}

}
