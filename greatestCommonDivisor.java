public class greatestCommonDivisor {
    
    public static int GCD(int a,int b) {
        while(a>0&&b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0) return b;
        return a;
    }
    public static void main(String[] args) {
        System.out.println(GCD(5,25));
    }
}
