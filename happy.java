import java.util.HashSet;
import java.util.Set;

public class happy {
    public static boolean isHappy(int n) {
        // int slow=squaredSum(n);
        // int fast=squaredSum(squaredSum(n));
        // while(slow!=fast){
        //     slow=squaredSum(slow);
        //     fast=squaredSum(squaredSum(fast));
        // }
        // return slow==1;
        Set<Integer>usedNums=new HashSet<>();
        while(true){
            n=squaredSum(n);
            if(n==1) return true;
            if(usedNums.contains(n)) return false;
            usedNums.add(n);
        }
    }
    private static int squaredSum(int x){
        int sum=0;
        while(x!=0){
            sum+=(x%10)*(x%10);
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
