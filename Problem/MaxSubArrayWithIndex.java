public class MaxSubArrayWithIndex {

	public static void main(String[] args) {
		
		// Problem Statement - Return indexes of sub array which is having maximum sum.
		// Input: [-2,1,-3,4,-1,2,1,-5,4] ArrayLength= 9
		// Output: Max sum: 6, Array Index: 3,6
		
		System.out.println("Enter number of items - ");
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		if(count < 1) return;
		
		int[] array = new int[count];
		
		for(int i=0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Calculating maximum sum of sub array -- ");
		
		int[] result = new int[2]; 
		
		
		result = GetMaxSubArrayIndex(array);
		
		for(int i: result) {
			System.out.println(i);
		}
		
		
	}

	private static int[] GetMaxSubArrayIndex(int[] array) {
		int[] result = new int[2];
		if(array.length == 1) {
			result[0] = 0;
			return result;
		}
		
		int currentMax = array[0], globalMax = array[0];
		result[0] = 0;
		result[1] = 0;
		
		for(int i = 1; i < (array.length); i++) {
			
			if(array[i] > (currentMax + array[i]))
			{
				currentMax = array[i];
				result[0] = i;
				result[1] = i;
				
			} else {
				currentMax = currentMax + array[i];
			}
			
			if(globalMax < currentMax) {
				globalMax = currentMax;	
				result[1] = i;	
			}
			
			
		
		}
		System.out.println("Max Sum = " + globalMax);
		
		return result;
		
	}
	
}


