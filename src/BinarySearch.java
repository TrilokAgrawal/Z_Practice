import java.util.Arrays;


public class BinarySearch {
	
	public int[] binarySearch(int[] arr, int element) {
		if(arr != null && arr.length > 1) {
			int center = arr.length /2;
			if(element > arr[center]) {
				return binarySearch(arr = Arrays.copyOfRange(arr, center+1, arr.length), element);
			} else if(element < arr[center]){
				return binarySearch(arr = Arrays.copyOfRange(arr, 0, center), element);
			}else {
				return new int[]{arr[center]};
			}
		} else if(arr.length == 1){
			return arr;
		}
			return null;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 4 , 10, 25, 28, 29, 31, 75};
		
		System.out.println(new BinarySearch().binarySearch(arr, 28)[0]);
	}

	

}
