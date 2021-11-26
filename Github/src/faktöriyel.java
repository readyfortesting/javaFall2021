import java.util.Scanner;

public class faktöriyel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen faktoriyeli alinacak sayiyi giriniz");
		int sayi,sonuc=1;
		sayi=scan.nextInt();

		for(int i=1; i<=sayi; i++){
		sonuc=sonuc*i;
		}
		System.out.println(sayi+"!="+sonuc);
		
		

	}

}
