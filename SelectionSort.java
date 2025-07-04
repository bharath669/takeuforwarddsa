public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={13,43,11,57,74,23,34};
        int n=arr.length;
        recur(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
    static void recur(int[] arr,int n ){
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }
}
