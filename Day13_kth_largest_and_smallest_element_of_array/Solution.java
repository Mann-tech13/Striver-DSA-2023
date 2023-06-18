package Day13_kth_largest_and_smallest_element_of_array;

import java.util.*;

public class Solution {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Collections.sort(arr);
        if (n == k) {
            res.add(arr.get(n - 1));
            res.add(arr.get(0));
            return res;
        }

        res.add(arr.get(k - 1));
        res.add(arr.get(n - k));
        return res;
    }
}
