package Day6_count_inversions;


public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        int left = 0, right = (n - 1);
        return mergeSort(arr, left, right);
    }

    static long merge(long arr[], int left, int mid, int right) {
        long cnt = 0;
        int i = left, j = mid + 1, index = 0;
        long temp[] = new long[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
                cnt += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
        return cnt;
    }
    
    static long mergeSort(long arr[], int left, int right) {
        long cnt = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            cnt += mergeSort(arr, left, mid);
            cnt += mergeSort(arr, mid + 1, right);
            cnt += merge(arr, left, mid, right);
        }
        return cnt;
    }

}