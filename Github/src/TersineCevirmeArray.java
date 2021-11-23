import java.util.Iterator;

public class TersineCevirmeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]array= {1,2,3,4,5,6,7,8};
		System.out.print("Before revorse :");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		
		int[]reverseArray=reverse(array);
		System.out.println();
		
		System.out.print("After reverse : ");
		
		for (int j = 0; i < array.length; i++) {
			System.out.print(reverseArray[i]+ " ");
		}
		
		}

	}

	public static int[] reverse(int[] array) {
		
		int [] temp=new int[array.length];
		for (int i = 0; i < array.length; i++) {
			temp[i]=array[array.length -i -1];

			
		}
		
		return temp;
	}

}
