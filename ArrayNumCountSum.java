
class SumCount{
    public static int  sum(int index,int[] arr,int n,int sum){
        if(index==arr.length){
            // condition is satisfied
            return sum==n ?1:0;
        }
        int l =sum(index+1,arr,n,sum + arr[index]); 
            
        
        int r=sum(index+1,arr,n,sum);
            
        return l+r; 
    }
}

public class ArrayNumCountSum{
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int n=2;
        int count = SumCount.sum(0,arr,n,0);
        System.out.println("subsequence with sum" + n + ":" + count);
    }
}