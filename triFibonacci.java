public class triFibonacci {
    public static int tribonacci(int n) {
        if(n==0||n==1) return n;
        int T0=0;
        int T1=1;
        int T2=1;
        for(int i=3;i<=n;i++){
            int TI=T0+T1+T2;
            T0=T1;
            T1=T2;
            T2=TI;
        }
        return T2;
        
    }
    public static void main(String[] args) {
        System.out.println(tribonacci(3));
    }
}
