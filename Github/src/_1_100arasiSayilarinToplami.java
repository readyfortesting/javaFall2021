

public class _1_100arasiSayilarinToplami {

	public static void main(String[] args) {
		// 1'den 100'e kadar olan do�al say�lar�n toplam�n� bulan program� yaz�n�z.

		
		int sayi=100;
		int toplam=0;
		for(int i=1; i <= sayi;i++)
		{
		  toplam+=i;
		}
		System.out.println("1-100 arasi sayilarin toplami :" + toplam);
		
	}

}
