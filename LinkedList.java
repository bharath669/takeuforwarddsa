class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
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
    public static Node removebyelement(Node head,int ele){
        if(head==null){
            return head;
        }
        if(head.data==ele){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null; 
        while(temp!=null){
            if(temp.data==ele){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static Node inserthead(Node head,int val){
        Node temp=new Node(val,head);
        return temp;

    }
    public static Node inserttail(Node head,int val){
        if(head==null){
            return new Node(val);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        temp.next=newNode;
        return head;
    }
    public static Node insertElePosition(Node head,int ele,int k){
        if(head==null){
            if(k==1){
                return new Node(ele);
            }
            else{
                return null;
            }
        }
        if(k==1){
            return new Node(ele,head);
        }

        Node temp=head;
        int cnt=0;
        while(temp!=null) {
            cnt++;
            if(cnt==k-1){
                Node x=new Node(ele);
                x.next=temp.next;
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
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
        // Node remTail=removeTail(head);
        // display(remTail);
        // Node remPos=removebyelement(head, 4);
        // display(remPos);
        // Node inserthead=inserthead(head, 12);
        // display(inserthead);
        // Node inserttail=inserttail(head, 5);
        // display(inserttail);
        Node insertPos=insertElePosition(head, 10, 3);
        display(insertPos);
    }
}