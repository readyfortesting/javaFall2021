package day06_wrapper;

public class C02_Concatination {

	public static void main(String[] args) {
		
		//SORU1: aþaðýdaki variable'larý kullanarak metinleri  aþaðýda verilen metinleri yazdýralým.
		
		String str1="Java";
		String str2="Guzel";
		int sayi1=5;
		int sayi2=4;
		
		// Java Guzel 54 yazdýralým.
		System.out.println(str1+" " + str2 +" " + sayi1 + sayi2); // Java Guzel 54

		// Java 5 Guzel yazdýralým.
		System.out.println(str1+" "+ sayi1+" " + str2); // Java 5 Guzel
		
		// Java 94 yazdýralým.
		System.out.println(str1+" " + (sayi1+sayi2)+ sayi2); // Java 94 (9 yapmak için sayi ve sayi2 topladýk,4 yazmak i.in sadece sayi2 yazdýk.
		
		// Java 19 yazdýralým.
		System.out.println(str1+ " " + (sayi1-sayi2)+ (sayi1+sayi2)); // Java 19 (önce 1i bulduk paran tez içinde çýkarmna iþlemi yayaptýk,
		                                                            //sonra 9 U BULMAK için say1 ve say2 parantez içinde topladýk.
		
		//54 Guzel yazalým.
		System.out.println(""+sayi1 + sayi2 + " " + str2); //54 Guzel, baþýna hiçlik ekledi "" , içinde hiçbir deðer yok.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
