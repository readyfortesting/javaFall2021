import java.util.Arrays;
import java.util.Scanner;

public class Haluk23ArrayQ1 {

	public static void main(String[] args) {
		
		// KULLAN�C�N�N G�RD�G� SAY� KADAR �NT ARRAY OLUSTURAN VE ARRAY ELEMANLAR�N� KULLAN�C�DAN ALAN
		// VE G�R�LEN ARRAY ELEMANLAR�N�N EN BUYUK �LE EN KUCUK ELEMAN�N�N ARAS�NDAK� FARK� GOSTEREN
		// JAVA PROGRAM� YAZ�N�Z.
		
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
