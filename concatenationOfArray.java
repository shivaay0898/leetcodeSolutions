import java.util.Arrays;

public class concatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[nums.length+i]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
