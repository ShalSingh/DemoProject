import java.util.Arrays;

public class BinarySearch {

	public static int searchElement(int[] arr, int first,int last,int search) {	
		int mid  = (first+last)/2;
		while(first <= last) {
			
				if(search == arr[mid])
					return mid;
				else if (search> arr[mid])
					return searchElement(arr,mid+1,last,search);
				else
					return searchElement(arr,first,mid-1,search);
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {10,4,6,80,30,56,54,80};
		Arrays.sort(arr);
		int length = arr.length-1;
		int search = 30;		
		int find = searchElement(arr,0,length, search);
		System.out.println(find);
		
	}

}
