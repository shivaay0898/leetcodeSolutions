public class reversInteger {
  public static int reverse(int x) {
    long ans = 0;
    // initialising answer
    while (x != 0) {
      ans = ans * 10 + x % 10;
      x /= 10;
    }
    // reversing our x

    return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    // returning value if it is bounded by integer range
  }

  public static void main(String[] args) {
    System.out.println(reverse(1231));
  }
}
