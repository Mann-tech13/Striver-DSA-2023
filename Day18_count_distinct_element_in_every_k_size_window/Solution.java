package Day18_count_distinct_element_in_every_k_size_window;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the first window
        for (int i = 0; i < k; i++) {
            frequencyMap.put(arr.get(i), frequencyMap.getOrDefault(arr.get(i), 0) + 1);
        }

        // Add the count of distinct elements in the first window to the result
        result.add(frequencyMap.size());

        // Process subsequent windows
        for (int i = k; i < arr.size(); i++) {
            // Remove the first element of the previous window from the frequency map
            frequencyMap.put(arr.get(i - k), frequencyMap.get(arr.get(i - k)) - 1);
            if (frequencyMap.get(arr.get(i - k)) == 0) {
                frequencyMap.remove(arr.get(i - k));
            }

            // Add the current element to the frequency map
            frequencyMap.put(arr.get(i), frequencyMap.getOrDefault(arr.get(i), 0) + 1);

            // Add the count of distinct elements in the current window to the result
            result.add(frequencyMap.size());
        }

        return result;
    }
}
