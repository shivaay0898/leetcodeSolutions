public class powerMath {
    public static double myPow(double x, long n) {
        double ans=1;
        long notneg=n;
        if(notneg<0) notneg=-1*notneg;
        while(notneg>0){
            if(notneg%2==1){
                ans=ans*x;
                notneg=notneg-1;
            }
            else{
                x=x*x;
                notneg=notneg/2;
            }
        }
        if(n<0){
            ans=1/ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,3));
    }
}
