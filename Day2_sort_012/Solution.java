package Day2_sort_012;

public class Solution {
    public static void sort012(int[] arr)
    {
        int[] freq = new int[3];
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                freq[0]++;
            }
            else if(arr[i] == 1){
                freq[1]++;
            }
            else{
                freq[2]++;
            }
        }
        int index = 0;
        for(int i=0; i<3; i++){
            while(freq[i] > 0){
                arr[index++] = i;
                freq[i]--;
            }
        }
    }
}
