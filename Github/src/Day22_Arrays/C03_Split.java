package Day22_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java ��rendim,# �ok para kazand�m.," 
		// cumlesinin kelimelerini ozel karakterler ve noktala isaretleri olmadan
		// hard sirasina gore yazdiralim.
		
		String cumle = "Java ��rendim, # �ok para kazand�m.," ;
		
		// once kelimelere bolelim
		//bunun icin array olusturakim
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));
		// [Java, ��rendim,, #, �ok, para, kazand�m.,]

	}

}
