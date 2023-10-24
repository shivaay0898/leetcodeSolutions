public class stairclimb {
    public static int climbStairs(int n) {
        int temp1=1;//for n==0
        int temp2=1;//for n==1
        int res=1;//base case answer
        for(int i=0;i<n-1;i++){
            res=temp1+temp2;
            temp1=temp2;
            temp2=res;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(0));
    }
}
