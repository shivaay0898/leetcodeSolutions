import java.lang.Math;
public class addDigitsTillOne {
    public static int addDigits(int num) {
        // while (num >= 10) {
        //     int rem = num % 10;
        //     num = num / 10;
        //     int ans = rem+num;
        //     num=ans;
        // }
        // return num;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(335));
    }
}
