public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={13,43,11,57,74,23,34};
        int n=arr.length;
        func(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
    static void func(int[] arr,int n ){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1] >arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
