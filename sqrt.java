import java.util.*;

class sqrt {
    public static int mySqrt(int x) {
        long l = 1;
        long r = x + 1;
    
        while (l < r) {
          final long m = (l + r) / 2;
          if (m > x / m)
            r = m;
          else
            l = m + 1;
        }
    
        // l: smallest number s.t. l * l > x
        return (int) l - 1 ;

        // long low=1;
        // long up=x+1;
        // //Variables initialised
        // while(low<up)
        // {
        //     long mid=(low+up)/2;
        //     if(mid>x/mid){
        //         up=mid;
        //     }
        //     else{
        //         low=mid+1;
        //     }
        // }
        // //binary search
        // return (int)low-1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}