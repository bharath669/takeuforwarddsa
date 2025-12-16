class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}

class LinkedList{
    public static void main(String[] args){
        int[] arr={1,4,8,3};
        Node n=new Node(arr[0], null);
        System.out.println(n.data);
    }
}