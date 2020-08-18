import java.util.Scanner;

public class HelloWorld {

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
		
		sort(arr);
		
		System.out.println("Sorted list: ");
		
		for(int i=0; i < noOfElements; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
		
	}

	private static void sort(int[] arr) {
		
		int[] helper = new int[arr.length];
		mergeSort(arr, helper, 0, arr.length-1);
		
		
	}
	
	private static void merge(int[] arr, int[] helper, int low, int middle, int high) {
		
		for(int i = low; i<= high; i++) {
			helper[i] = arr[i];
		}
		
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		while( helperLeft <= middle && helperRight <= high) {
			
			if(helper[helperLeft] <= helper[helperRight]) {
				arr[current] = helper[helperLeft];
				helperLeft ++;
			} else {
				arr[current] = helper[helperRight];
				helperRight ++;
			}
			
			current ++;
			
		}
		
		int remaining = middle - helperLeft;
		
		for(int i=0; i<= remaining; i++) {
			arr[current + i] = helper[helperLeft + i];
		}
		
		
	}

	private static void mergeSort(int[] arr, int[] helper, int low, int high) {
		
		if(low < high) {
			
			int middle = low + (high - low) / 2;
			
			mergeSort(arr, helper, low, middle);
			mergeSort(arr, helper, middle+1, high);
			
			merge(arr, helper, low, middle, high);
			
		}
		
	}


}
