public class strictlyPalindromic {
    public static boolean isStrictlyPalindromic(int n) {
        String rep="";
        for(int i=2;i<=n-2;i++){
            int n1=n;
            while(n1!=0){
                rep+=Integer.toString(n1%i);
                n1=n1/i;
            }
            if(palindrome(rep)==false) return false;
        }
        return true;
    }
    public static boolean palindrome(String n){
        int left=0;
        int right=n.length() - 1; // subtract 1 to get the index of the last character
        while(left<right){
            if(n.charAt(left)!=n.charAt(right))   return false;
            left++;
            right--;
        }
        return true;
        //return false if you want to give better time soln
    }
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(11));
    }
}
