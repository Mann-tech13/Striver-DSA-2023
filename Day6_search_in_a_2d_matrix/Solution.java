package Day6_search_in_a_2d_matrix;

import java.util.ArrayList;

public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int rows = mat.size();
        int cols = mat.get(0).size();
        if(mat.get(rows-1).get(cols-1) < target){
            return false;
        }
        int row = 0;
        for(int i=0; i<rows; i++){
            if(mat.get(i).get(cols-1) >= target){
                row = i;
                break;
            }
        }
    
        int left = 0; int right = cols-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mat.get(row).get(mid) == target){
                return true;
            }
            else if(mat.get(row).get(mid) > target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
}
