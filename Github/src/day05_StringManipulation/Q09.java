package day05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
    	
    	/*
        StringMethods:
    kullan�c�dan al�nan  cift uzunlukta bir stringin ilk yarisini konsolda yazdirmak icin bir
     Java programi yaziniz.
        ORNEK:
        INPUT      :  Python
        OUTPUT :   Pyt
*/
Scanner scan=new Scanner(System.in);
System.out.print("bir string giriniz :");
String str=scan.nextLine();
 if (str.length()%2==0) {
     System.out.println("girilen stringin ilk yarisi :"+str.substring(0,str.length()/2));
    
}else {
    System.out.println("agam ben ile egleniir tek uzunlukta string girmis");
    
    
    scan.close();
}  
    }    	
    	
    	
} 	
    	
    	
       

    
 
