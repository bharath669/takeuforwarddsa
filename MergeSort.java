
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(12,32,4,23,45,56,34));
        int low=0;
        int high=list.size()-1;
        mergesort(list,low,high);
        for(int num:list){
            System.out.print(num+" ");
        }
    }
    static void mergesort(ArrayList<Integer> list,int low,int high){
        if(low>=high)return;
        int mid=low+(high-low)/2;
        mergesort(list,low,mid);
        mergesort(list,mid+1,high);
        merge(list,low,mid,high);
    }
    static void merge(ArrayList<Integer> list,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer>temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if(list.get(left)<=list.get(right)){
                temp.add(list.get(left));
                left++;
            }
            else{
                temp.add(list.get(right));
                right++;
            } 
        }
        while(left < mid){
            temp.add(list.get(left));
            left++;
        } 
        while(right<=high){
            temp.add(list.get(right));
            right++;
        }
        for(int i=0;i<temp.size();i++){
            list.set(low+i,temp.get(i));
        }
    }
}
