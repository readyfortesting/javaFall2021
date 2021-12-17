package Day33_StringBuilder;

public class C04_insert {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java ogrendik");
	
		// Java       ogrendik,araya cok iyi kelimesini ekleyelim.
		sb.insert(4, "yi cok iyi" );
		System.out.println(sb); // Javayi cok iyi ogrendik
		
		//sb.insert(5, "cok iyiyim", 0, 4);
		System.out.println(sb); // Javaycok i cok iyi ogrendik (olmadi)
		
		sb.insert(7, "cok iyiyim", 0, 4);
		System.out.println(sb);
		// Javayi cok cok iyi ogrendik
		
		

	}

}
