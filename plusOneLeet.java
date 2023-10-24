import java.util.*;
import java.lang.Math;

public class plusOneLeet {
    public static int[] plusOne(int[] digits) {
    for(int i = digits.length-1; i >=0; i--){
        if(digits[i] <9){
            digits[i] =digits[i]+1;
            return digits;
        }
        digits[i]=0;
        //case for all the general numbers
    }
    int res[]=new int[digits.length+1];
    res[0]=1;
    return res;
    //case for numbers like 9,99,999
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int sol[]=plusOne(arr);
        for (int i = 0; i < sol.length; i++){
            System.out.print(sol[i]);
        }

    }

}
