package Day3_find_duplicate_in_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        int res = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr.get(i))){
                res = arr.get(i);
                break;
            }
            else{
                map.put(arr.get(i), 1);
            }
        }
        return res;
    }
}
