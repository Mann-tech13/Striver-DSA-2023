package Day5_merge_sorted_arrays;

import java.util.Arrays;

public class Solution {
     public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        
        for (int i = 0; i < n; i++) {
            arr1[i + m] = arr2[i];
        }
        Arrays.sort(arr1);

        return arr1;
    
    }
}
