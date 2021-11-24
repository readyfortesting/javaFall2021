

public class Day13_ReplaceAll {

	public static void main(String[] args) {
		
		// replaceAll : hepsini degistirir.
		
		// ekstra ozellikler var.
		// butun harfler x olsun istersek bunu replaceAll ile yapabiliriz.
		// butun harfleri degistirir, butun sayilari degistir,butun harf olmayanlari degistir gibi seyleri yapabiliriz.
		
		// replaceAll() metodunda REGULAR EXPRESSIONS kullanilabilir.
		
		
		String str="*Java 98ogrenmek c..ok k852olay";
		
		str=str.replaceAll("\\d", ""); // butun digitleri \\d, "" hiclikle degistirip atama yaptik str=str yaparak,kalici olsun diye.
		
		System.out.println(str.replace("x", " "));
		
		System.out.println(str.replaceAll("\\s", "x")); // *Javaxogrenmekxc..okxkolay   simdi x leri space yapalim,replace kullaniriz.
		
		
		System.out.println(str); //   *Java ogrenmek c..ok kolay  yazdirdi.
		
		System.out.println(str.replaceAll("\\w", "")); //   *  ..  yazdirdi, butun harfleri sildirdi.
		
		//  \\d    digitleri sil. (sayilari) (0-9)
		//  \\D     DÝGÝTLER (SAYILAR DISINDAKÝ HERSEY)
		//  \\w   harf olanlari sil (a-z,A-Z,0-9
		//   \\W   harf olmayanlari sil 
		//   \\s   space,bosluklari kaldir.
		//   \\s+  1'den fazla bosluk varsa
		//   \\S   SPACE DÝSÝNDAKÝ TUM KARAKTERLER
		
		
		// BÝRDEN FAZLA BOSLUGU KALDÝRMAK ÝCÝN
		
		String cumle="Java       cok         zevkli";
		cumle=cumle.replaceAll("\\s+", " ");
		System.out.println(cumle); // Java cok zevkli
		
		
		String cumle1="Java cok zevkli";
		cumle1 = cumle1.replaceAll(" [ak]", ""); // [ak] a ve k arasindaki tum karakterleri hiclik yap.
		System.out.println(cumle1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
