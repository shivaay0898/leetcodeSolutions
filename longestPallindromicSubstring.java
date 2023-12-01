public class longestPallindromicSubstring {
    public static String longestPalindrome(String s) {
        String res = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (max < right - left + 1) {
                    res = s.substring(left, right + 1);
                    max = right - left + 1;
                }
                left -= 1;
                right += 1;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (max < right - left + 1) {
                    res = s.substring(left, right + 1);
                    max = right - left + 1;
                }
                left -= 1;
                right += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));// bab
    }
}
