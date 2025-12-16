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
    public static void main(String[] args){
        int[] arr={1,4,8,3};
        Node head=convertArr2LL(arr);
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}