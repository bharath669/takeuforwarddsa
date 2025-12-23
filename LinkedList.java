class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
};

class LinkedList{
    public static Node convertArr2LL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static Node reverseLinkedList(Node head){
        if(head==null|| head.next==null){
            return head;
        }
        Node newnNode=reverseLinkedList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newnNode;
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node delNodebyHead(Node head){
        if(head==null){
            return head;
        }
        head=head.next;
        return head;
    }
    public static Node removeTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    
    public static void main(String[] args){
        int[] arr={1,4,8,3};
        Node head=convertArr2LL(arr);
        display(head);
        // Node delHead=delNodebyHead(head);
        // display(delHead);
        // Node reversed=reverseLinkedList(head);
        // display(reversed);
        Node remTail=removeTail(head);
        display(remTail);
    }
}