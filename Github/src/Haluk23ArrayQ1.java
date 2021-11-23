import java.util.Arrays;
import java.util.Scanner;

public class Haluk23ArrayQ1 {

	public static void main(String[] args) {
		
		// KULLANÝCÝNÝN GÝRDÝGÝ SAYÝ KADAR ÝNT ARRAY OLUSTURAN VE ARRAY ELEMANLARÝNÝ KULLANÝCÝDAN ALAN
		// VE GÝRÝLEN ARRAY ELEMANLARÝNÝN EN BUYUK ÝLE EN KUCUK ELEMANÝNÝN ARASÝNDAKÝ FARKÝ GOSTEREN
		// JAVA PROGRAMÝ YAZÝNÝZ.
		
		Scanner scan =new Scanner(System.in);
		System.out.print("arryinizin boyutunu giriniz :");
		
		int arrBoyutu =scan.nextInt();
		
		int arr []=new int[arrBoyutu];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayin "+(i+1) +". elemanini giriniz : ");
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("girdiginiz arrayin max - min eleman degeri :"+(arr[arrBoyutu - 1] - arr[0]));
	}

}
