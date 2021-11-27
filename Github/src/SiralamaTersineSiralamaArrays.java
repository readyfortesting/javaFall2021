import java.util.Arrays;

public class SiralamaTersineSiralamaArrays {

	public static void main(String[] args) {
		
		String ayrac="=================";
		
		int a=9;
		int b=2;
		int c=4;
		int d=5;
		
		System.out.println("sayilar = " +a+" "+b+" "+c+" " +d);
		System.out.println(ayrac);
		System.out.println("Arrays.sort() : yöntemiyle ( KUCUKTEN BUYUGE DEFAULT)");
		
		int[] sayiDizisi= {a,b,c,d};
		Arrays.sort(sayiDizisi); // kucukten BUYUGE SÝRALAMA YAPÝLDÝ
		
		for(int x: sayiDizisi) {
			System.out.print(x + " ");
		}
		System.out.println("\n"+ayrac);
		
		System.out.println("Arrays.sort() : yöntemiyle ( BUYUKTEN KUCUGE)");
		System.out.println("eleman sayisi :" + sayiDizisi.length);
		
		for(int i =sayiDizisi.length-1; i>=0;i--) {
			System.out.print(sayiDizisi[i]);
		}
	

	}
}
