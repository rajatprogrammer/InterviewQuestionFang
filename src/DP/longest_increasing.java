package DP;

import java.util.Arrays;
//https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
public class longest_increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		System.out.print(longestIncreasing(arr));
	}
	
	static int longestIncreasing(int arr[]) {
		int dp[] = new int[arr.length+1];
		Arrays.fill(dp,1);
		int max=0;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					dp[i]=Math.max(dp[i], dp[j])+1;
					max=Math.max(dp[i], max);
				}
			}
		}
		return max;
	}

}
