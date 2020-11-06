
public class BubbleSort {

	static void sortElements(int[] arr) {
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,4,6,80,30,56,54,80};
		sortElements(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
