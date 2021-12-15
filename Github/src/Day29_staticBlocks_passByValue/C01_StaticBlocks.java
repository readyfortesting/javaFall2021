package Day29_staticBlocks_passByValue;

public class C01_StaticBlocks {

	static { // *** STATIC BLOCK NEREYE YAZÝLÝRSA YAZÝLSÝN MAÝN METHODDAN ONCE CALÝSÝR*****
				// EÐER BÝRDEN FAZLA STATÝC BLOCK VARSA JAVA YUKARÝDAKÝNÝ DAHA ÖNCE
				// ÇALIÞTIRIR.******
		System.out.println("static block ne zaman calisacak");
	}

	public static void main(String[] args) { // bir class calisinca önce main methos calisir fakat static blok varsa her
												// zaman once
												// static block calisir,nerede yazildiginin onemi yoktur!!!*****!!!1
		System.out.println("javada once main method calisir");

	}

	static {
		System.out.println("static blok nereye yazilirsa yazilsin main method'dan bile once calisir");
	}

}
