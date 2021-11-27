import java.util.Scanner;

public class DaireAlanHacimBulma {

	public static void main(String[] args) {
		
		// Dairenin alanini ve hacmini bulan program
		
		
		
		
		int yaricap ;
		double alan,hacim,pi=3.14;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("daire yaricapini giriniz : ");
		yaricap=scan.nextInt();
		
		alan=2 * 3.14 * yaricap;
		hacim = 3.14 * (yaricap*yaricap);
		
		System.out.println("dairenin alani : " + alan);
		System.out.println("dairenin hacmi : " + hacim);
		
		
		
		

	}

}
