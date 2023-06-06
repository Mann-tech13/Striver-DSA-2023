package Day1_set_matrix_zeros;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        Set<Integer> row = new HashSet<Integer>();
        Set<Integer> col = new HashSet<Integer>();

        for(int i=0; i<rowLen; i++){
            for(int j=0; j<colLen; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0; i<rowLen; i++){
            for(int j=0; j<colLen; j++){
               if(row.contains(i) || col.contains(j)){
                   matrix[i][j] = 0;
               } 
            }
        }
        
    }

}