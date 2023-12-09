import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while (top <= bottom && right >= left) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                ans.add(matrix[j][right]);
            }
            right--;
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    ans.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    ans.add(matrix[l][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiralOrder(arr));
    }
}
