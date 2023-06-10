package Day5_missing_and_repeating_numbers;

import java.util.* ;
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] res = new int[2];
        Map<Integer, Boolean> numberMap = new HashMap<>();

        for (Integer i : arr) {
 
            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
            else {
                res[1] = i;
            }
        }

         for (int i = 1; i <= n; i++) {
            if (numberMap.get(i) == null) {
                res[0] = i;
            }
        }
        return res;
    }
}
