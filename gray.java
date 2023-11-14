import java.util.ArrayList;
import java.util.List;

public class gray {
    public static List<Integer> grayCode(int n) {
        // List<Integer> finalAns= new ArrayList<>();
        // List<String> midAns= grayCodetemp(n);
        // for(int i=0;i<midAns.size();i++){
        //     finalAns.add(Integer.parseInt(midAns.get(i),2));
        // }
        // return finalAns;
        List<Integer> ans=new ArrayList<>(1<<n);
        for(int i=0;i<(1<<n);i++){
            ans.add(i^(i>>1));
        }
        return ans;

    }
    // public static List<String> grayCodetemp(int n) {
    //     if(n==1){
    //         List<String> tempAns=new ArrayList<>();
    //         tempAns.add("0");
    //         tempAns.add("1");
    //         return tempAns;
    //     }
    //     List<String> temp=grayCodetemp(n-1);
    //     List<String> ans=new ArrayList<>();
    //     for(int i=0;i<temp.size();i++){
    //         ans.add("0"+temp.get(i));
    //     }
    //     for(int j=temp.size()-1;j>=0;j--){
    //         ans.add("1"+temp.get(j));
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        System.out.println(grayCode(3));
    }
}
