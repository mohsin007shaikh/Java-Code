import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		int noOfElements;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements to sort - ");
		
		noOfElements = sc.nextInt();
		
		int[] arr = new int[noOfElements];
		
		System.out.println("Enter elements: ");
		
		for(int i=0; i < noOfElements; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("unSorted list: ");
		
		for(int i=0; i < noOfElements; i++) {
			System.out.println(arr[i]);
		}
		
		sort(arr, 0, arr.length-1);
		
		System.out.println("Sorted list: ");
		
		for(int i=0; i < noOfElements; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
		
	}

	private static void sort(int[] arr, int left, int right) {
		
		int index = partition(arr, left, right);
		
		System.out.println("index Value " + index);
		
		if(left < index -1) {
			sort(arr, left, index-1);
		}
		
		if(left < right) {
			sort(arr, index, right);
		}
		
		
		
	}

	private static int partition(int[] arr, int left, int right) {
		
		int pivot = arr [ left + (right - left) / 2 ];
		System.out.println("pivot Value " + pivot);
		
		while(left <= right)
		{
			while (arr[left] < pivot) left ++;
			
			while (arr[right] > pivot) right --;
			
			if(left <= right) {
			 int temp = arr[left];
			 arr[left] = arr[right];
			 arr[right] = temp;
			 
			 left ++;
			 right --;
			}
		}
		
		
		return left;
	}
	
}
