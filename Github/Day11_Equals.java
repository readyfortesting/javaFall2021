package kendimceDenemelerim;

public class Day11_Equals {

	public static void main(String[] args) {
		
		 String evim1="Cok";
		    String evim2= "Rahat";
		    String evim3= ("Cok Rahat");
		    String evim4= evim1+" "+ evim2;
		    
		    System.out.println(evim1+" "+ evim2); // Cok Rahat yazdirir.
		 	System.out.println(evim3==evim4); // FALSE doner..
		 	System.out.println(evim3.equals(evim4)); // TRUE doner.
		    
		    String mujde1= "George";
		    String mujde2 = "Hagi";
		    String mujde3 = "George Hagi";
		    String mujde4 = mujde1 + " " + mujde2;
		    
		    System.out.println(mujde1 + " " + mujde2); // "George Hagi" yazar.
		    System.out.println(mujde3==mujde4); // FALSE doner
		    System.out.println(mujde3.equals(mujde4)); // TRUE  doner
		
		
			String ismim1 = "Gonca";
			String ismim2 = "Gul";
			String ismim3 = "Gonca Gul";
			String ismim4 = ismim1+" " + ismim2;
		    System.out.println(ismim4);   // Gonca Gul yazdirir.
		    System.out.println(ismim3==ismim4); // False yazdirir. == ÝSE: HEM DEGERE HEM REFERANSÝNA BAKAR,GENELDE FALSE DONER.
		    System.out.println(ismim3.equals(ismim4)); // true doner. // EQUALS - SADECE DEGERE BAKAR.
		    
		
		
		
		
		
		

	}

}
