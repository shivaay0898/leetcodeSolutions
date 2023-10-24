public class uniquePaths3 {
    public static int uniquePathsIII(int[][] grid) {
        int numZeros = 0, initX = 0, initY = 0;// initialising number of zeroes and origin
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 0)    numZeros++;//getting zero quantity
                else if (grid[r][c] == 1) {
                    initX = r;//gettingX
                    initY = c;//gettingY
                }
            }
        }
        return dfs(grid, initX, initY, numZeros);//solution using dfs which implements recursion and backtracking
    }

    public static int dfs(int arr[][], int x, int y, int zeros) {
        if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length || arr[x][y] == -1) {
            return 0;
        }
        if (arr[x][y] == 2) {
            return zeros == -1 ? 1 : 0;
        }
        arr[x][y] = -1;
        zeros--;
        int totalPaths = dfs(arr, x, y, zeros) + dfs(arr, x + 1, y, zeros) + dfs(arr, x, y + 1, zeros)
                + dfs(arr, x - 1, y, zeros) + dfs(arr, x, y - 1, zeros);
        arr[x][y]=0;
        zeros++;//backtracking in cases of failure
        return totalPaths;
    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } };
        System.out.println(uniquePathsIII(grid));
    }
}
