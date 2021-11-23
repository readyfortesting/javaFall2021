import java.util.Scanner;

public class _3SayidanBuyukOlaniBulma {

	public static void main(String[] args) {
		
		//üç sayıdan hangi sayının daha büyük olduğunu bulan bir program yazınız.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input first number please");
		int number1=scan.nextInt();

		System.out.println("Input second number please");
		int number2=scan.nextInt();

		System.out.println("Input third number please");
		int number3=scan.nextInt();
		
		// İlk once 3 sayidan en buyuk sayiyi bulabilmek icinsayi1 ile sayi2 karsilastiririz.
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
