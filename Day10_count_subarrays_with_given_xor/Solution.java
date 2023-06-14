package Day10_count_subarrays_with_given_xor;

import java.util.*;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int xr = 0;
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			xr ^= arr.get(i);
			int k = x ^ xr;

			if (map.containsKey(k)) {
				count += map.get(k);
			}
			map.put(xr, map.getOrDefault(xr, 0) + 1);
		}
		return count;

	}
}