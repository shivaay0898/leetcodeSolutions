import java.util.ArrayList;
import java.util.List;

public class kidsAndCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= max);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(arr, 3));
    }
}