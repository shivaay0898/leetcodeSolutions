import java.util.Arrays;

public class searchMatrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int row = 0;
        int column = matrix[0].length-1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target)
                return true;
            if (matrix[row][column] < target)
                row++;
            else
                column--;
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[][]={{1,2},{4,5}};
        System.out.println(searchMatrix(arr, 2));
    }
}