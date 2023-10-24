import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class largestNum {
    public static String largestNumber(int[] nums) {
        String s[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = nums[i] + "";
        }
        Arrays.sort(s, (a, b) -> (a + b).compareTo(b + a));
        // Arrays.sort(s, (a, b) -> {
        //     long n1 = Long.parseLong(a + b);
        //     long n2 = Long.parseLong(b + a);
        //     if(n1<n2)   return 1;
        //     else if(n1>n2)  return -1;
        //     else return 0;
        // });
        //insight of sort function
        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }
        return sb.toString().startsWith("0") ? "0" : sb.toString();
        // final String s = Arrays.stream(nums)
        // .mapToObj(String::valueOf)
        // .sorted((a, b) -> (b + a).compareTo(a + b))
        // .collect(Collectors.joining(""));
        // return s.startsWith("00") ? "0" : s;
        // short solution
    }

    public static void main(String[] args) {
        int arr[] = { 3, 30, 34, 5, 9 };
        String sol = largestNumber(arr);
        System.out.println(sol);

    }
}
