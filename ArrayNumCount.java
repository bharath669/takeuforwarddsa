class Count{
    public static int numcount(int num, int arr[]){
        int cnt=0;
        for (int i =0; i <arr.length; i++) {
            if(num==arr[i]){
                cnt++;
            }    
        }
        return cnt;
    }
}


public class ArrayNumCount {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,2,5,4};
        int num=7;
        System.out.println(Count.numcount(num, arr));
        
    }
}
