public class palindromicSubstring {
    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
         count+=countpali(s, i, i);//counting odd palindrome
         count+=countpali(s, i, i+1);//counting even palindrome
        }
        return count;//counted substrings which are palindrome
    }
    public static int countpali(String s,int left, int right){
        int paliCount = 0;
          for (int i = 0; i < s.length(); i++) {
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                paliCount+=1;
                left--;
                right++;
            }
        }
        return paliCount;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abcdeffedcba"));
    }
}
