package kendimceDenemelerim;

public class Concatenation {

	public static void main(String[] args) {
		
		String isim="Ali Esat";
		String soyisim="Balkupu";
		String adSoyad=isim+soyisim;
		String bosluk=" ";
		System.out.println(isim+bosluk+soyisim);
		System.out.println(isim.concat(bosluk)+soyisim);
		
		String s="Hello";
		s=s.concat(" World");
		System.out.println(s);
		
		String str1="Computer";
		String str2=" Science ";
		String str3=str1.concat(str2);
		System.out.println(str3);
		
		String str4="Portal";
		String str5=str3.concat(str4);
		System.out.println(str5);
		
		
	}
}
