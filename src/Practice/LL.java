package Practice;

public class LL {
    public Node head;
    public Node tail;
    int size;

    public class Node {
    Node next;
    int data;
    public Node(int data){
        this.data=data; }
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }

    public boolean Cycle(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null){
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }

        }
    }

