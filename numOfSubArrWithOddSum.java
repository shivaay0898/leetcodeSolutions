import java.math.BigInteger;

public class numOfSubArrWithOddSum {
    public static int numOfSubarrays(int[] arr) {
        long ans=0;
        int sum=0;
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum%2==0){
                ans=ans+odd;
                even++;
            }
            else{
                ans=ans+even+1;
                //odd in itself can create seperate subset
                odd++;
            }
        }
        return (int)ans % 1000000007;//given in question
        // BigInteger ans=BigInteger.valueOf(0);
        // int sum=0;
        // int even=0;
        // int odd=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        //     if(sum%2==0){
        //         ans=ans.add(BigInteger.valueOf(odd));
        //         even++;
        //     }
        //     else{
        //         ans=ans.add(BigInteger.valueOf(even+1));
        //         odd++;
        //     }
        // }
        // return ans.mod(BigInteger.valueOf(1000000007)).intValue();
    }
    
    public static void main(String[] args) {
        int ans[]={1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(ans));
    }
}