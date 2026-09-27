package Exception;

public class reverseelements {

	public static void main(String[] args) {
		int[] arr = {11,12,13,14,15,16};
		int[] result = new int[arr.length];
		
		for (int i =0; i<arr.length; i++) {
		result[i] = reversenumber(arr[i]);
	}
		for (int num : result ) {
			System.out.print(num + " ");
		}
	}
	static int reversenumber(int num) {
		int reversed = 0;
		while (num != 0 ) {
			int digit = num % 10;
			reversed = reversed *10+digit;
			num /=10;
		}
		return reversed;
		}

	}


