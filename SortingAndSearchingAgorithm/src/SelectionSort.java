
public class SelectionSort {
	static void sortElements(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			int min_index =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,4,30,2,80};
		sortElements(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
