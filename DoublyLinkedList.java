class Node1{
    int data;
    Node1 next;
    Node1 back;
    Node1(int data,Node1 next,Node1 back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    Node1(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}

public class DoublyLinkedList {
    public static Node1 convertarr2DLL(int[] arr){
        Node1 head=new Node1(arr[0]);
        Node1 prev=head;
        for(int i=1;i<arr.length;i++){
            Node1 temp=new Node1(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static Node1 deletehead(Node1 head){
        Node1 prev=head;
        if(head==null || head.next==null){
            return null;
        }
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }

    public static Node1 deletetail(Node1 head){
        Node1 tail=head;
        if(head==null || head.next==null){
            return null;
        }
        while(tail.next!=null){
            tail=tail.next;
        }
        Node1 newtail=tail.back;
        newtail.next=null;
        tail.back=null;
        return head;
    }

    public static Node1 remoceKthElement(Node1 head,int k){
        if(head==null){
            return null; 
        }
        Node1 temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                break;
            }
            temp=temp.next;
        }
        Node1 prev=temp.back;
        Node1 front=temp.next;
        if(prev==null&&front==null){
            return null;
        }
        else if (prev==null) {
            head=deletehead(head);
        }
        else if (front==null) {
            head=deletetail(temp);
        }
        else{
        prev.next=front;
        front.back=prev;
        temp.next=null;
        temp.back=null;
        }
        return head;
    }

    public static Node1 deletenode(Node1 head,int val){
        Node1 temp=head;
        while(temp!=null){
            if(temp.data==val){
                break;
            }
            temp=temp.next;
        }
        Node1 prev=temp.back;
        Node1 front=temp.next;
        if(front==null){
            prev.next=null;
            temp.back=null;
        }
        else{
            prev.next=front;
            front.back=prev;
            temp.next=temp.back=null;
        }
        return head;
    }
    public static Node1 insertnodeinhead(Node1 head,int val){
        Node1 newHead=new Node1(val,head,null);
        head.back=newHead;
        return newHead;
    }
    public static void print(Node1 head){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,5,7,4};
        Node1 head=convertarr2DLL(arr);
        // print(head);
        // Node1 delhead=deletehead(head);
        // print(delhead);
        // Node1 deltail=deletetail(head);
        // print(deltail); 
        // Node1 delbypos=remoceKthElement(head, 2);
        // print(delbypos);
        // Node1 delnode=deletenode(head,4);
        // print(head);
        Node1 insertNode=insertnodeinhead(head, 10);
        print(insertNode);
    }
}
