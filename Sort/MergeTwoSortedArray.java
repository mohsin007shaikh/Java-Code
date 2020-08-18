public class Merge {

	public static void main(String[] args) {
		
		int[] A = {2,6,7,9,10,0, 0 , 0, 0 , 0};
		
		int[] B = {1,3};
		
		int[] C = merge(A,B);
		
		for(int i=0; i<C.length; i++) {
			System.out.println("Megred List: " + C[i]);
		}
		
	}

	private static int[] merge(int[] a, int[] b) {
	    //Assume 5 is count of Array A contents and 2 is count of Array B content	
		int lastIndex = 5 + 2 - 1;
		System.out.println("lastIndex: " + lastIndex);
		int aLastIndex = 5-1;
		int bLastIndex = 2-1;
		
		while(bLastIndex >= 0) {
			if(aLastIndex >= 0 && a[aLastIndex] > b[bLastIndex]) {
				a[lastIndex] = a[aLastIndex];
				aLastIndex --;
			} else {
				a[lastIndex] = b[bLastIndex];
				bLastIndex --;
			}
			lastIndex--;
		}
		
		return a;
		
	}	
}
