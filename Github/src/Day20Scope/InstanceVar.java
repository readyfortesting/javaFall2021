package Day20Scope;

public class InstanceVar {

	int notMath = 50;
	
	int notFen; // instance variable'da deger atamak zorunda degilsiniz
	// instance variable'larin scop'unda main method yoktur.
	
	
	public static void main(String[] args) {

		
	//System.out.println(notMath);// main method static oldugu icin
// static olmayan variable'lar main method'da direk kullanilamaz veya goruntulenemez.		
		
// OBJE olusturup (notMath) k�smina ulasabiliriz. // InstanceVar celil=new InstanceVar();
		//*** OBJE ve CLASS �SM� AYN� OLMAL�D�R******
// Class ismi ile ayni olmali InstanceVar;
// Celil objesi uzerinden STAT�K olamayan method ve variable'lara ULA�AB�L�R�Z.

		InstanceVar celil=new InstanceVar();
		System.out.println(celil.notMath); // 50'yi goeduk console'da
		
		InstanceVar nihal=new InstanceVar();
		nihal.notMath=70;
		System.out.println(nihal.notMath); // 70 gecerli olur yeni deger.
		
		// Yeniden Celilin notunu yazdirsak
		System.out.println(celil.notMath); // 50,Celilin notu de�i�mez
// Celilin notunu degi�tirmek istiyorsak celil.notMath=90; yapmamiz lazim.
	   celil.notMath=90;
	   System.out.println(celil.notMath); //90 gosterir.
	   
	   celil.method2(); // STAT�C olmadigi icin main methoddan D�REK CAGR�LAMAZ!!****
	              // method2(); BAS�NA CEL�L YAZ�NCE CEL�L �C�N BU METODU CAL�ST�RACAK
	             // cAL�S�NCA D�REK method2'ye gider.
	             // method2 de notFen assign edilmedigi icin JAVA 0 olarak kabul eder.
	   
	} 
	
public static void staticMethod( ) {
	
	//Static methoddan notFen'e ula�abilir miyim? Hayir. Statik degil,ulasamayiz.
	// �nstance variable'lara STATIC methoddan ulas�lamaz!***
	
}

 public void method2( ) {
	 //*** bu method STATIC olmadigi icin instance variablera D�REK ULASAB�L�R.*****
	 // notFen atanmadigi icin 0,bizde not atarsak not degisir
	 notFen=100;
	 System.out.println("method2'deki notFen : " + notFen); // method2'deki notFen : 0
	 // notFen=100; atadiktan sonra method2'deki notFen : 100 yazdirdi.
	 
 }
 }