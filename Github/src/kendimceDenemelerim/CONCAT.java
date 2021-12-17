package kendimceDenemelerim;

public class CONCAT {

	public static void main(String[] args) {
		
		String isim="Ali Esat";
		String soyisim="Balkupu";
		String adSoyad=isim+soyisim;
		String bosluk=" ";
		System.out.println(isim+bosluk+soyisim);
		System.out.println(isim.concat(bosluk)+soyisim);

	}

}
