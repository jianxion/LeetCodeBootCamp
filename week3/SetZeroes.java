import java.util.*;


public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zero_rows = new HashSet<>();
        HashSet<Integer> zero_cols = new HashSet<>();
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zero_rows.add(i);
                    zero_cols.add(j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zero_rows.contains(i) || zero_cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
