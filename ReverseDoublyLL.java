import java.util.Stack;

class Node2{
    int data;
    Node2 next;
    Node2 back;
    Node2(int data,Node2 next,Node2 back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    Node2(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}

public class ReverseDoublyLL {
    public static Node2 convertarr2LL(int[] arr){
        Node2 head=new Node2(arr[0]);
        Node2 prev=head;
        for(int i=1;i<arr.length;i++){
            Node2 temp=new Node2(arr[i]);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static void display(Node2 head){
        Node2 temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void reverseDLL(Node2 head){
        Node2 temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        Node2 temp1=head;
        while(temp1!=null){
            temp1.data=st.peek();
            st.pop();
            temp1=temp1.next;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        Node2 head=convertarr2LL(arr);
        display(head);
        reverseDLL(head);
        System.out.println();
        display(head);
    }
}
