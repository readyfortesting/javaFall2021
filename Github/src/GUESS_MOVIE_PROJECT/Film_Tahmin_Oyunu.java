package GUESS_MOVIE_PROJECT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Film_Tahmin_Oyunu {

	public static void main(String[] args) {
		
		//1 film listesi olustur
		List<String> filmListesi = new ArrayList<>();
		//2
		filmListesi.add("Titanic");
		filmListesi.add("Yuzuklerin Efendisi");
		filmListesi.add("God Father");
		filmListesi.add("Mucize Doktor");
		filmListesi.add("Cesur Yurek");
		filmListesi.add("Zubuk");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 1den " +filmListesi.size()+"a kadar bir sayi girin");
		int sira=scan.nextInt()-1;
		String filmAdi=filmListesi.get(sira).toLowerCase();
		System.out.println(filmAdi);
		
		String gizliIsim=filmAdi.replaceAll("\\S", "-");
		System.out.println(gizliIsim);
		
		List<Integer>indexList=new ArrayList<>();
		int count=0;
		do {
		
		System.out.println("lutfen bir harf tahmin ediniz");
		char harf=scan.next().toLowerCase().charAt(0);
		String hrf=Character.toString(harf);
		
		if(!filmAdi.contains(hrf)) {
		count++;	
		}
					
		if(count==3) {
			System.out.println("Kaybettiniz");
			break;
			
		}
		System.out.println(count+"kadar hatali girdiniz\nKalan hakkiniz : " + (3-count));
		for (int i = 0; i < filmAdi.length(); i++) {
			if(filmAdi.charAt(i)==harf) {
			indexList.add(i);
			}
		}
		
		for (int i = 0; i <indexList.size(); i++) {
			gizliIsim=gizliIsim.substring(0, indexList.get(i))+filmAdi.substring(indexList.get(i),indexList.get(i)+1)
			+gizliIsim.substring(indexList.get(i)+1);
			System.out.println(gizliIsim);
		}if(filmAdi.equalsIgnoreCase(gizliIsim)) {
		System.out.println("Tebrikler,kazandiniz");}
		}while (!filmAdi.equalsIgnoreCase(gizliIsim));
		
					
	}
}

		
	
	
	
		
		
		

	


