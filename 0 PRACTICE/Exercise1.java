public class Exercise1 {

	public static void main(String[] args) {
		
		// 1D array having cubes of 1 to 9
		int arr[] = {1, 8, 27, 64, 125, 216, 343, 512, 729};
		
		display(arr);
		System.out.println();
		
		String [][] arr2 = {{"Apple","Mango"},
							{"Kiwi", "Orange"}};
		
		display(arr2);
		System.out.println();
	}
	
	// Method to print Integer 1D array
	public static void display(int arr[]) {
		System.out.println("\n***** Cube of 1 to 9 ******");
		for(int num : arr) {
			
			System.out.println(num+" ");
		}
	}
	
	// Method to print String 2D array
	public static void display(String arr[][]) {
		System.out.println("\n***** Fruits in arr[][] *****");
		for(String [] val: arr)
		for(String num : val) {
			
			System.out.println(num+" ");
		}
	}
}