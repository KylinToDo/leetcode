package 剑指Offer.easy;

public class _0029CodingSkill {
    /**
     * use for-loop control the process
     */
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix.length == 0) {
                return new int[0];
            }
            int[] res = new int[matrix.length * matrix[0].length];
            int u = 0, d = matrix.length - 1, l = 0, r = matrix[0].length - 1;
            int idx = 0;
            while (true) {
                for (int i = l; i <= r; i++) {
                    res[idx++] = matrix[u][i];
                }
                if (++u > d) {
                    break;
                }
                for (int i = u; i <= d; i++) {
                    res[idx++] = matrix[i][r];
                }
                if (--r < l) {
                    break;
                }
                for (int i = r; i >= l; i--) {
                    res[idx++] = matrix[d][i];
                }
                if (--d < u) {
                    break;
                }
                for (int i = d; i >= u; i--) {
                    res[idx++] = matrix[i][l];
                }
                if (++l > r) {
                    break;
                }
            }
            return res;
        }
    }

}
