package Subarray;
/*Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
Examples:

Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80

Input:
ar1[] = {1, 5, 5}
ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
Output: 5, 5
 * */
public class common_element {

	public static void main(String[] args) {
		int arr1[] = {1, 5, 10, 20, 40, 80};
		int arr2[]  = {6, 7, 20, 80, 100};
		int arr3[]  = {3, 4, 15, 20, 30, 70, 80, 120};
		findCommon(arr1,arr2,arr3);
		
	}
	static void findCommon(int ar1[], int ar2[], int ar3[]) 
    { 
        // Initialize starting indexes for ar1[], ar2[] and ar3[] 
        int i = 0, j = 0, k = 0; 
  
        // Iterate through three arrays while all arrays have elements 
        while (i < ar1.length && j < ar2.length && k < ar3.length) 
        { 
             // If x = y and y = z, print any of them and move ahead 
             // in all arrays 
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
             {   System.out.print(ar1[i]+" ");   i++; j++; k++; } 
  
             // x < y 
             else if (ar1[i] < ar2[j]) 
                 i++; 
  
             // y < z 
             else if (ar2[j] < ar3[k]) 
                 j++; 
  
             // We reach here when x > y and z < y, i.e., z is smallest 
             else
                 k++; 
        } 
    } 
}
