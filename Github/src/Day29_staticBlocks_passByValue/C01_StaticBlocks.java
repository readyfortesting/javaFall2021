package Day29_staticBlocks_passByValue;

public class C01_StaticBlocks {

	static { // *** STATIC BLOCK NEREYE YAZ�L�RSA YAZ�LS�N MA�N METHODDAN ONCE CAL�S�R*****
				// E�ER B�RDEN FAZLA STAT�C BLOCK VARSA JAVA YUKAR�DAK�N� DAHA �NCE
				// �ALI�TIRIR.******
		System.out.println("static block ne zaman calisacak");
	}

	public static void main(String[] args) { // bir class calisinca �nce main methos calisir fakat static blok varsa her
												// zaman once
												// static block calisir,nerede yazildiginin onemi yoktur!!!*****!!!1
		System.out.println("javada once main method calisir");

	}

	static {
		System.out.println("static blok nereye yazilirsa yazilsin main method'dan bile once calisir");
	}

}
