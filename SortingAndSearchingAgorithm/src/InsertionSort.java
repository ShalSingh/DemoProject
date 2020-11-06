
public class InsertionSort {
	static void sortElements(int[] arr) {
		for(int i =1; i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j >=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] =key;
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
