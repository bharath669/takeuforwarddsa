import java.util.ArrayList;
import java.util.List;

class SumCount{
    public static boolean  sum(int index,int[] arr,int n,List<Integer> current,int sum){
        if(index==arr.length){
            // condition is satisfied
            if(sum==n){
                System.out.println(current);
                return true;
            }
            else return false;
        }
        current.add(arr[index]);
        if(sum(index+1,arr,n,current,sum + arr[index])==true)
            return true;
        
        current.remove(current.size() -1);
        // sum=-arr[index];
        if(sum(index+1,arr,n,current,sum)==true)
            return true;
        return false;
    }
}

public class ArrayNumCountSum{
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int n=2;
        System.out.println("subsequence with sum" + n + ":");
        SumCount.sum(0,arr,n,new ArrayList<>(),0);
    }
}