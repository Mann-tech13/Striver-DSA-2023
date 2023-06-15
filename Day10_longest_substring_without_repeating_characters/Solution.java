package Day10_longest_substring_without_repeating_characters;

import java.util.* ;
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		HashMap < Character, Integer > map = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (map.containsKey(s.charAt(right))) left = Math.max(map.get(s.charAt(right)) + 1, left);

            map.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
	}
}
