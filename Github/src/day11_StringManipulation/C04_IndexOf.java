package day11_StringManipulation;

public class C04_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Girilen bir char veya Stringin ilk index'ini verir.
		
String str= "Calisirsaniz, Java ogrenmek cok kolay";
// char olarak
System.out.println(str.indexOf('s')); // 4 s harfinin indexi 4 verir.
System.out.println(str.indexOf('J')); // 13 str string'inde J'nin index'i : 14
System.out.println(str.indexOf('y')); // 36 str sitring'inde y'nin index'i :35

// String olarak
System.out.println(str.indexOf("J")); // "j" nin string olarak indexi:14 (bosluk da sayilir)

// int olarak
int index=str.indexOf("r");
System.out.println(index); // 6 dondurur.


// OLMAYAN HARFindexi'ini istediginde java bize -1 dondurur.

System.out.println(str.indexOf('q')); // -1. Cunku q harfi string icinde yok..
System.out.println(str.indexOf('h')); // -1 doner, cunku h harfi string icinde yok.
System.out.println(str.indexOf("A")); // -1 doner,buyuk A YOK,jAVA cASEsENSÝTÝVE OLDUGUNDAN -1 DONER.

// PARAMETRE KELÝME OLARAK ARATILIRSA, MESELA "Java" gibi.

System.out.println(str.indexOf("Java")); // 14 verir,0'dan baslar Java kelimesini paket olarak sayar.
System.out.println(str.indexOf("cok")); // 28
System.out.println(str.indexOf("kolay")); // 32

// Sonraki a'nin  veya anlamsiz harf hecelerin indexini sorgularsak.
//Aradigimiz charSquence anlamli-anlamsiz bir kelime olabilir.Java aradigimiz charSquence'i tek bir PAKET gibi dusunur.
// "Calisirsaniz, Java ogrenmek cok kolay"

System.out.println(str.indexOf("va og")); //16 verir,yine tek bir PAKET gibi sayar.1 sayar yani.
System.out.println(str.indexOf("cok kol")); // 28

// 15'ten sonraki e'nin indexini bulun derse ?

System.out.println(str.indexOf('e',15)); // 22
System.out.println(str.indexOf('a', 10)); // 15

















//System.out.println(str.indexOf("va og")); // 16
// Aradigimiz anlamli-anlamsiz bir kelime olabilir,bu durumda Java aradigimiz 
// cs' i tek bir paket gibi dusunur.

System.out.println();












	}

}
