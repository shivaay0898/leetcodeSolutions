import java.util.Arrays;

public class maximumSumOfAnHourglass {
    public static int maxSum(int[][] grid) {
        int ans = 0;
        for (int i = 1; i + 1 < grid.length; i++) {
            for (int j = 1; j + 1 < grid[0].length; j++) {
                ans = Math.max(ans, grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1] +
                        grid[i][j] + grid[i + 1][j - 1] + grid[i + 1][j] +
                        grid[i + 1][j + 1]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(maxSum(arr));
    }
}
