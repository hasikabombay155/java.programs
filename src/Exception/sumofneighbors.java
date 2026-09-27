package Exception;

public class sumofneighbors {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60};
		int n = arr.length;
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			int prev = (i == 0 ) ? arr[i] : arr[i - 1];
			int next = (i == n-1) ? arr[i] : arr[i+1];
			result[i] = prev + next;
		}
		for (int num : result ) {
			System.out.print(num + " ");
		}
	}

}
