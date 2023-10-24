public class number1Bits {
    public static int hammingWeight(int n) {
        // int count=0;
        // String str=Integer.toBinaryString(n);
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='1') count++;
        // }
        // return count;
        int count=0;
        for(int i=0;i<32;i++){
            if(((n >> i)&1)==1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(hammingWeight(n));
    }
}
