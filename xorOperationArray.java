import java.util.Arrays;

public class xorOperationArray {
    public static int xorOperation(int n, int start) {
        int res = 0;
        int end = start + 2 * (n - 1);
        for (int i = start; i <= end; i += 2) {
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(1, 7));

    }
}