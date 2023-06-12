package Day8_pair_sum;

import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<int[]> ans = new ArrayList<>();

        for( int num : arr){
            int rem = s - num;

            if(map.containsKey(rem)){
                for( int i = 0; i < map.get(rem); i++){
                    ans.add(new int[]{Math.min(num,rem),Math.max(num,rem)});
                }
            }

            map.put(num,map.getOrDefault(num,0)+1);
        }


        Collections.sort(ans, new Comparator<int[]>(){
            @Override
            public int compare(int[] x, int[] y){
                if(x[0]==y[1]){
                    return x[1] - y[1];
                }else{
                    return x[0] - y[0];
                }
            }
        });

        return ans;

    }
}

