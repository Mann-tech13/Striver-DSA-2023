package Day13_remove_duplicates_from_sorted_array;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<arr.size(); i++){
			set.add(arr.get(i));
		}
		return set.size();
	}
}