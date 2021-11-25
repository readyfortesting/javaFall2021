import java.util.Scanner;

public class EKOK {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		int ekok=0;
		int max;
		
		System.out.println("1.sayiyi giriniz");
		int sayi1=scan.nextInt();
		
		System.out.println("2.sayiyi giriniz");
		int sayi2=scan.nextInt();
		
		max=sayi1*sayi2;
		
		for (int i = max; i > 0; i--) {
			if (i%sayi1==0 && i % sayi2 ==0) {
				ekok=i;
		}
		
		}System.out.println("Ekok : " + ekok);
		
		
		
		
		
		
		
		
		
	}

}
