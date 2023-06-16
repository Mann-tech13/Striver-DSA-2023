package Day12_trapping_rain_water;

public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        long trappedWater = 0;
        int left = 0, right = n-1;
        long leftMax = 0, rightMax = 0;

        while(left < right){
            if(arr[left] <= arr[right] ){
                if(arr[left] >= leftMax){
                    leftMax = arr[left];
                }
                else{
                    trappedWater += leftMax - arr[left];
                }
                left++;
            }
            else{
                if(arr[right] >= rightMax ){
                    rightMax = arr[right];
                }
                else{
                    trappedWater += rightMax - arr[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
}

