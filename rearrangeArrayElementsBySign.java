import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rearrangeArrayElementsBySign {
    public static int[] rearrangeArray(int[] nums) {
        // int midAnsPos[]=new int[nums.length/2];
        // int midAnsNeg[]=new int[nums.length/2];
        // int k=0;
        // int l=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         midAnsPos[k++]=nums[i];
        //     }
        //     else{
        //         midAnsNeg[l++]=nums[i];
        //     }
        // }
        // k=0;
        // for(int i=0;i<nums.length;i=i+2){
        //     nums[i]=midAnsPos[k++];
        // }
        // l=0;
        //  for(int i=1;i<nums.length;i=i+2){
        //     nums[i]=midAnsNeg[l++];
        // }
        // return nums;
        int ans[]=new int[nums.length];
        List<Integer> midAnsNeg=new ArrayList<>();
        List<Integer> midAnsPos=new ArrayList<>();
        for(int num:nums){
            (num>0?midAnsPos:midAnsNeg).add(num);
        }
        int j=0;
        int k=0;
        for(int i=0;i<ans.length;i=i+2){
            ans[i]=midAnsPos.get(j++);
            ans[i+1]=midAnsNeg.get(k++);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
