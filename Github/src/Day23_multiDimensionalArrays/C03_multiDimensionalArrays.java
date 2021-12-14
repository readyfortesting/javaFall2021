package Day23_multiDimensionalArrays;

public class C03_multiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[][]= {{1,2},{4,5,6,7} };
		
		carpimYazdir(arr);
		
	
		
	}

	private static void carpimYazdir(int[][] arr) {
	
		
	int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
		carpim*=arr[i][j];		
				
			}
		}
		System.out.println(carpim);
	}

}
