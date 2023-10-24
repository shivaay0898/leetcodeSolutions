public class powerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // if(n<0) return false;
        // int count=0;
        // String str=Integer.toBinaryString(n);
        // System.out.println(str);
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='1'){
        //         count++;
        //     }
        // }
        // if(count==1)    return true;
        // return false;
       if(n<0) return false;
       while(n!=1){
        if(n%2!=0) return false;
        n=n/2;
       }
       return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }
}
