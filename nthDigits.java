import java.util.Arrays;

public class nthDigits {
    public static int findNthDigit(int n) {
        int start = 1;// start can be 1 10 100 1000 etc
        long count = 9;// we count till next 9 90 900 9000 etc digits
        int digit = 1;// initialising the number of digits as one
        while (n > digit * count) {
            n -= digit * count;
            ++digit;
            count *= 10;
            start *= 10;
        } // we keep subtracting n till we find out starting point
          // updating our ranges
        int destination = start + (n - 1) / digit;// number we want
        int index = (n - 1) % digit;// index we desire
        return String.valueOf(destination).charAt(index) - '0';
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(11));
    }
}
