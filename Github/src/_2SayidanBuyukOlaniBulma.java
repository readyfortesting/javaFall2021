import java.util.Scanner;

public class _2SayidanBuyukOlaniBulma {

	public static void main(String[] args) {
		
		//�ki say�dan hangi say�n�n b�y�k oldu�unu bulan bir program yaz�n�z.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input first number please");
		int number1=scan.nextInt();
		
		
		System.out.println("Input second number please");
		int number2=scan.nextInt();
		
		// Simdi bu iki sayiyi karsilastirmamiz gerekir. 3 farkli kosul var.
		
		//1.kosul
		if (number1>number2) {
			System.out.println("First number is greater");
		}else if (number2>number1) {
			System.out.println("Second number is greater");
		}else {
			System.out.println("Numbers are equal");
		}
		

	} 
}
