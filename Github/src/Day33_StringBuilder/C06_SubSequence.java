package Day33_StringBuilder;

public class C06_SubSequence {

	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder ("Java ne kadar kolay");
		
		sb.substring(14);
		System.out.println(sb.substring(14));      // kolay
		System.out.println(sb.substring(14, 19)); // kolay
		
		
		//*** subString methodu STRING döndürür. ***
		
		// **** subSequence methhodu ATAMA da yaptirir.****
		
		//*** ikisi de ayni sonucu dondurur ancak SUBSTRING() sTRÝNG CLASS'ÝNDAN GELDÝGÝ ÝCÝN substring kullandiginda
		//arkasindan String methodlarini kullanabilirim.
		// ancak subSeqyence methodunu kullandigimda bu mumkun olmaz. *****
		
	}

}
