package Day12_reverse_words_in_a_string;

public class Solution {
    public static String reverseString(String str) {
        String[] arr = str.split(" ");
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i].trim() + " ";
        }
        return res;
    }
}
