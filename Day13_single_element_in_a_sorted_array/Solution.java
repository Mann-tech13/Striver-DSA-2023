package Day13_single_element_in_a_sorted_array;

import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        int start = 0;
        int end = arr.size() - 1;

        if(end == 0){
            return arr.get(0);
        }
        else if(arr.get(0) != arr.get(1)){
            return arr.get(0);
        }
        else if (arr.get(end) != arr.get(end-1)){
            return arr.get(end);
        }

        
        while (start < end) {
            int mid = start + (end-start)/2;

            if (mid % 2 == 0) {

                if(arr.get(mid)==arr.get(mid+1)){
                    start = mid + 2;
                }
                else{
                    end = mid;
                }
                
            } 
            else{
                if(arr.get(mid) == arr.get(mid-1)){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return arr.get(start);
    }


}


