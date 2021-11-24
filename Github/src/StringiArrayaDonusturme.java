
public class StringiArrayaDonusturme {

	public static void main(String[] args) {

     String metin = "Bugun de gunlerden. Cumadir Cuma. Yar hamama gitme. Kinani yuma. Ben seni sevmisim. Ellere deme.";
     
  
     String[] cumleler=metin.split("\\."); // TERS SLASH \\ GORMEZDEN GELME-IGNORE-
     System.out.println(cumleler.length);
     System.out.println(cumleler[0]);
     System.out.println(cumleler[1]);
     System.out.println(cumleler[2]);
   
   
	}

}
