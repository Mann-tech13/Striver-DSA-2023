package Day1_pascals_triangle;
import java.util.ArrayList;

public class Solution {

	public static long logic(int n, int r){
		// nCr
		long res = 1;
		for(int i=0; i<r; i++){
			res = res * (n - i);
			res = res / (i+1);
		}
		return res;
	}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> res = new ArrayList<>();
		
		for(int i=1; i<=n; i++){
			ArrayList<Long> tempList = new ArrayList<Long>();
			for(int j=1; j<=i; j++){
				tempList.add(logic(i-1, j-1));
			}
			res.add(tempList);
		}

		return res;
	}

}

