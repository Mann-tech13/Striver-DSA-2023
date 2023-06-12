package Day8_unique_path;

public class Solution {
	public static int uniquePaths(int m, int n) {
		int[][] mat = new int[m][n];
		mat[m-1][n-1] = 1;
		for(int i=m-1; i>=0; i--){
			for(int j=n-1; j>=0; j--){
				if(i == m-1 && j == n-1){
					continue;
				}
				if(i == m-1 && j != n-1){
					mat[i][j] = mat[i][j+1];
					continue;
				}
				if(i != m-1 && j == n-1){
					mat[i][j] = mat[i+1][j];
					continue;
				}
				mat[i][j] = mat[i+1][j] + mat[i][j+1];
			}
		}
		return mat[0][0];
	}
}