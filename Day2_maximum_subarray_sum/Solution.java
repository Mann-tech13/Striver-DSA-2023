package Day2_maximum_subarray_sum;

public class Solution {
    public static long maxSubarraySum(int[] arr, int n) {
		long sum = 0;
		long max = Long.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];

			if(max < sum){
				max = sum;
			}
			if(sum < 0){
				sum = 0;
			}
		}
		return max < 0 ? 0 : max;
	}
}
