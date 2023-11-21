import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        HashMap<Character, Integer> m = new HashMap<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (m.containsKey(s.charAt(right))) {
                left = Math.max(left, m.get(s.charAt(right)) + 1);
            }
            m.put(s.charAt(right), right);
            len = Math.max(right - left + 1, len);
            right++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
