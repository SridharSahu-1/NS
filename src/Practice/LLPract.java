package Practice;

public class LLPract {

 Node head;
 Node tail;
 int size;
    public LLPract() {
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;     }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;             }
        }

    public void addFirst(int val){
        Node node = new Node(val);
        node.next=head;
            head=node;
        if(tail==null) {
            tail = head;
        }
        size++;
    }



    public void display(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public void addLast(int val){
        if(tail==null){
            addFirst(val);
            return;
                }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }


    }


