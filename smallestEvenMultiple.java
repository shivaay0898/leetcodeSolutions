public class smallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        // int ans=Math.max(n,2);
        // while(ans%n!=0||ans%2!=0){
        //     ans=ans*2;
        // }
        // return ans;
        //O(log(ans))
        // if(n%2==0)  return n;
        // else return n*2;
        return n*(n%2+1);
    }

    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(6));
    }
}
