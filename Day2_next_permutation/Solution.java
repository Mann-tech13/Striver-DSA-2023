package Day2_next_permutation;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int index = -1;
		int size = permutation.size();
		for(int i=size-2; i>=0; i--){
			if(permutation.get(i) < permutation.get(i+1)){
				index = i;
				break;
			}
		}

		if(index == -1){
			Collections.reverse(permutation);
			return permutation;
		}

		for(int i=size-1; i>=index; i--){
			if(permutation.get(i) > permutation.get(index)){
				int temp = permutation.get(i);
				permutation.set(i, permutation.get(index));
				permutation.set(index, temp);
				break;
			}
		}

		Collections.reverse(permutation.subList(index+1, size));

		return permutation;
	}
}
