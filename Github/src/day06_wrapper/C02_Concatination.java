package day06_wrapper;

public class C02_Concatination {

	public static void main(String[] args) {
		
		//SORU1: a�a��daki variable'lar� kullanarak metinleri  a�a��da verilen metinleri yazd�ral�m.
		
		String str1="Java";
		String str2="Guzel";
		int sayi1=5;
		int sayi2=4;
		
		// Java Guzel 54 yazd�ral�m.
		System.out.println(str1+" " + str2 +" " + sayi1 + sayi2); // Java Guzel 54

		// Java 5 Guzel yazd�ral�m.
		System.out.println(str1+" "+ sayi1+" " + str2); // Java 5 Guzel
		
		// Java 94 yazd�ral�m.
		System.out.println(str1+" " + (sayi1+sayi2)+ sayi2); // Java 94 (9 yapmak i�in sayi ve sayi2 toplad�k,4 yazmak i.in sadece sayi2 yazd�k.
		
		// Java 19 yazd�ral�m.
		System.out.println(str1+ " " + (sayi1-sayi2)+ (sayi1+sayi2)); // Java 19 (�nce 1i bulduk paran tez i�inde ��karmna i�lemi yayapt�k,
		                                                            //sonra 9 U BULMAK i�in say1 ve say2 parantez i�inde toplad�k.
		
		//54 Guzel yazal�m.
		System.out.println(""+sayi1 + sayi2 + " " + str2); //54 Guzel, ba��na hi�lik ekledi "" , i�inde hi�bir de�er yok.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
