public class sumMultiples {
    public static int sumOfMultiples(int n) {
        return sumOfMultiples(n, 3) + sumOfMultiples(n, 5) + sumOfMultiples(n, 7) -
            (sumOfMultiples(n, 15) + sumOfMultiples(n, 21) + sumOfMultiples(n, 35)) +
            sumOfMultiples(n, 105);
      }

    // Returns sum of multiples of value in [1, n].

      private static int sumOfMultiples(int n, int value) {
        int lo = value;
        int hi = n / value * value;
        int count = (hi - lo) / value + 1;
        return (lo + hi) * count / 2;
      }
      public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
      }
}
