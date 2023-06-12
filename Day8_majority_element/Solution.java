package Day8_majority_element;

import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		if(n == 1){
			return arr[0];
		}
		int occurence = (int)Math.floor(n/2);
		int ans = -1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
				if(map.get(arr[i]) > occurence){
					ans = arr[i];
				}
			}
			else{
				map.put(arr[i], 1);
			}
		}
		return ans;
	}
}