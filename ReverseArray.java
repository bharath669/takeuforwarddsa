class Recursivefun{
    public void functoin(int l,int r,int arr[]){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        functoin(l+1, r-1, arr);
    }
}


class ReverseArray{
    public static void main(String args[]){
        int[] arr={12,34,54,32,21};
        Recursivefun rec =new Recursivefun();
        int l=0;
        int r=arr.length-1;
        rec.functoin(l, r, arr);
        for(int num :arr){
        System.out.println(num+"");
        }
    }
}