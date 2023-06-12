package Day8_longest_consecutive_sequence;

import java.util.*;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] nums, int N) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int longest = 0;
        for (int num : nums) {
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}