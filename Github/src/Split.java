import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
	
		// "Java öðrendim,# çok para kazandým.," 
		// cumlesinin kelimelerini ozel karakterler ve noktala isaretleri olmadan
		// hard sirasina gore yazdiralim.
		
		String cumle = "Java öðrendim, # çok para kazandým.," ;
		
		// once kelimelere bolelim
		//bunun icin array olusturakim
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));
		// [Java, öðrendim,, #, çok, para, kazandým.,]
		
		
		
		

	}

}
