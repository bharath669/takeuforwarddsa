import java.util.ArrayList;
import java.util.List;

class SumCount{
    public static void sum(int index,int[] arr,int n,List<Integer> current,int sum){
        if(index==arr.length){
            if(sum==n){
                System.out.println(current);
                
            }
            return;
        }
        current.add(arr[index]);
        sum(index+1,arr,n,current,sum + arr[index]);
        
        current.remove(current.size() -1);
        // sum=-arr[index];
        sum(index+1,arr,n,current,sum);
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