
public class SayilariTersYazma {

	public static void main(String[] args) {

		// Write a return method to reverse number.
		
		 int num = 456789, reversed = 0;

		    // run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
		
		
		
		
		
		
		
		

	}

}
