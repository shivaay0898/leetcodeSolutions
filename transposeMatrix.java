import java.util.Arrays;

public class transposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int ans[][]= new int[matrix[0].length][matrix.length];
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[0].length;c++){
                ans[c][r]=matrix[r][c];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        int res[][]=transpose(arr);
        for(int i=0;i<res.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
