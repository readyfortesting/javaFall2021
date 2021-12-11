package day13_stringManipulations;

public class C07_Substring {

	public static void main(String[] args) {
	
		
		// Substring cok yaygin kullanilir.********** ÖNEMLÝ ******
		
		String cumlem="Java OOP konsepti kullanir";
		
		// eger 1 index kullanirsak boyle
		
		System.out.println(cumlem.substring(5)); // OOP konsepti kullanir
		System.out.println(cumlem.substring(10)); // onsepti kullanir
		
		// 2 index kullanirsak
		
		System.out.println(cumlem.substring(5, 11)); // OOP ko yazdirir.
		System.out.println(cumlem.substring(3, 4));
		
		
		
		String tekrarim="Java code yaz";
				
		
		System.out.println(tekrarim.substring(5));
		System.out.println(tekrarim.substring(12));
		System.out.println(tekrarim.substring(5, 9));
		System.out.println(tekrarim.substring(8, 8));
		
		
		String text = "Can, Cananlara gitmek icin can atiyor";
		System.out.println(text.replace("Can", "Turk"));
		
		
		
		
	}

}
