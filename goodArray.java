public class goodArray {
    public static boolean isGood(int[] nums) {
        int count = 0;
        int max = nums.length;
        int secMax = max - 1;
        int sum = (secMax * (secMax + 1)) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
            if (nums[i] == secMax)
                count++;
        }
        if (sum == -secMax && count == 2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 4, 3, 3 };
        System.out.println(isGood(arr));
    }
}
