import java.util.Arrays;

public class reducingDishes {
    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        //sorting array
        int start=satisfaction.length-1;
        int total=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            total+=satisfaction[i];
            if(total<0){
                break;
            }
            start--;
        }
        //checking till sum from back is greater or equal to zero and returning start point
        total=0;
        int time=1;
        for(int j=start+1;j<satisfaction.length;j++){
            total+=satisfaction[j]*time;
            time++;
        }
        //calculating maximized time
        return total;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -8, 0, 5, -9 };
        System.out.println(maxSatisfaction(arr));
    }
}
