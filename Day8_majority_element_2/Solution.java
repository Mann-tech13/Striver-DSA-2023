package Day8_majority_element_2;

import java.util.* ;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        if(arr.size() < 3){
            return arr;
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int occurence = (int)Math.floor(arr.size()/3);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.size(); i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i), map.get(arr.get(i))+1);
                if(map.get(arr.get(i)) > occurence && ans.contains(arr.get(i)) == false){
                    ans.add(arr.get(i));
                }
            }else{
                map.put(arr.get(i), 1);
            }
       }
       return ans;
    }
}
