package Day29_staticBlocks_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		//100 tl'ye satýlan urun icin 2 farklý indirim uygulayan ifi method olusturalim
		
		int fiyat=100;
		indirimYap25(fiyat);
		

	}

	private static void indirimYap25(int fiyat) {
	fiyat*=0.75;
		
	}

}
