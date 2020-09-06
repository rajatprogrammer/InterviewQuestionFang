package Array;
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class max_continuous_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.print(maxSubArraySum(arr));
	}
	static int maxSubArraySum(int a[]) 
	{ 
		int size = a.length; 
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 

		for (int i = 0; i < size; i++) 
		{ 
			max_ending_here = max_ending_here + a[i]; 
			if (max_so_far < max_ending_here) 
				max_so_far = max_ending_here; 
			if (max_ending_here < 0) 
				max_ending_here = 0; 
		} 
		return max_so_far; 
	} 

}
