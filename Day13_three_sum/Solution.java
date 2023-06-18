package Day13_three_sum;

import java.util.*;

public class Solution {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {

        ArrayList<ArrayList<Integer>> triplets = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {

                continue;

            }

            int left = i + 1;

            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == K) {

                    ArrayList<Integer> triplet = new ArrayList<>();

                    triplet.add(arr[i]);

                    triplet.add(arr[left]);

                    triplet.add(arr[right]);

                    triplets.add(triplet);

                    while (left < right && arr[left] == arr[left + 1]) {

                        left++;

                    }

                    while (left < right && arr[right] == arr[right - 1]) {

                        right--;

                    }

                    left++;

                    right--;

                } else if (sum < K) {

                    left++;

                } else {

                    right--;

                }

            }

        }

        return triplets;

    }

}