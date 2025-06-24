
import java.util.ArrayList;
import java.util.List;

class Sequence{
    public static void sequencegenrator(int Index,int arr[],List<Integer> current,List<List<Integer>> result){
        if(Index==arr.length){
            result.add(new ArrayList(current));
            return;
        }
        //take or pick the particular index of the sequence
        current.add(arr[Index]);
        sequencegenrator(Index+1,arr,current,result);

        current.remove(current.size()-1);
        //Not take or Not pick the particular index of the sequence
        sequencegenrator(Index+1, arr, current, result);
    }
}


public class SubSequenceGenrator{
    public static void main(String[] args){
        int[] arr ={3,1,2};
        List<List<Integer>> result=new ArrayList<>();
        Sequence.sequencegenrator(0,arr,new ArrayList<>(),result);

        for(List<Integer> seq:result){
            System.out.print(seq);
        }
    }
}