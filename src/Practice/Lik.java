package Practice;

public class Lik {
    Node head;
    Node tail;
    int size;
    class Node{
        Node next;
        int val;
        public Node(int val){
            this.val=val;   }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;     }
    }



    public void addFirst(int val){
        Node node = new Node(val);
        if(tail==null) tail=head;
        node.next=head;
        head=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next; }
        System.out.println("END");
    }

    public void addLast(int val){
        Node node = new Node(val);
        if(tail==null)addFirst(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertAtK(int val,int k){
        Node node = new Node(val);
        Node temp=head;
        if(k==size)addLast(val);
        if(k==1)addFirst(val);
        for(int i=1;i<k;i++){
        temp =temp.next;    }
        node.next=temp.next;
        temp.next=node;
        size++;
    }


    public static void main(String[] args) {
        Lik ll = new Lik();
        ll.addFirst(12);
        ll.addFirst(84);
        ll.addFirst(52);
        ll.addFirst(36);
        ll.addFirst(754);
        ll.addLast(5554);
        ll.insertAtK(1234,3);
        ll.display();


    }
}
