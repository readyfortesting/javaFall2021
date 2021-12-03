import java.util.Scanner;

public class InterviewQuestion {

	public static void main(String[] args) {
		// Write a Java program to reverse a string
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string please");
		String str = scan.nextLine();
		
		// 1.way Use StringBuilder
		StringBuilder sb= new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse());
		
		
		System.out.println(revStr(str));

	}
	// 2nd way : Create a method to use for loop to reverse a String
		
	public static String revStr(String str) {
		
		String revStr="";
		for(int i=str.length()-1; i>=0;i--) {
			revStr+=str.charAt(i);
			
		}
		return revStr;
	}
	
	
}
