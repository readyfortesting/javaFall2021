import java.util.Scanner;

public class _3SayidanBuyukOlaniBulma {

	public static void main(String[] args) {
		
		//�� say�dan hangi say�n�n daha b�y�k oldu�unu bulan bir program yaz�n�z.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input first number please");
		int number1=scan.nextInt();

		System.out.println("Input second number please");
		int number2=scan.nextInt();

		System.out.println("Input third number please");
		int number3=scan.nextInt();
		
		// �lk once 3 sayidan en buyuk sayiyi bulabilmek icinsayi1 ile sayi2 karsilastiririz.
		// number1>= number2 && number1>= number3
		//number2>= number1  && number2>= number3   *** 3 farkli durumu kiyaslayim en buyuk sayiyi bulalim!***
		// number3>= number1 && number3>= number2
		
		
if (number1 >= number2 && number1 >= number3) {
	System.out.println("Greatest number : " + number1);
	
} else if (number2 >= number1 && number2 >= number3) {
	System.out.println("Grater number: " + number2);
	
} else if (number3 >= number1 && number3 >= number2) {
	System.out.println("Greater number : " + number3);
} {

}{

}
	}
	

}
