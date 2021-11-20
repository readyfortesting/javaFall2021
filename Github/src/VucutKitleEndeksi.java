import java.util.Scanner;

public class VucutKitleEndeksi {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Insert your weight please");
		double weight=scan.nextDouble();

		System.out.println("Insert your  height please");
		double height= scan.nextDouble();

		double bmi=weight/(height*height);

		if (bmi<18.5) {
		  System.out.println("You are weak");
		} else if (bmi>18.5 && bmi<25) {
		  System.out.println("Your weight is ideal");
		} else if (bmi>=25 && bmi<=30) {
			System.out.println("I am sorry, you are fat");
		} else if(bmi>30) {
        System.out.println("You are overweight");
    
		
		
		
		
		
		
		
		
		
		}
		}	
		
	}


