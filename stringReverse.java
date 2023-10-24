public class stringReverse {
    public static void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        s.toString();
        System.out.println(s);
    }
    public static void main(String[] args) {
        char q[]={'h','e','l','l','o'};
        reverseString(q);
        
    }
}
