import java.util.Arrays;

public class removeDuplicatesSorted2 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int num:nums){
            if(i<2||nums[i-2]!=num){
                nums[i++]=num;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 3 };
        int k=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr)+" "+k);
    }
}
